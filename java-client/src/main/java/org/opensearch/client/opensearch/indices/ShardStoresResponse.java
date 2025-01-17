/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/*
 * Modifications Copyright OpenSearch Contributors. See
 * GitHub history for details.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package org.opensearch.client.opensearch.indices;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.opensearch.indices.shard_stores.IndicesShardStores;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ToJsonp;
import org.opensearch.client.util.ObjectBuilder;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;

// typedef: indices.shard_stores.Response
public final class ShardStoresResponse implements ToJsonp {
	private final Map<String, IndicesShardStores> indices;

	// ---------------------------------------------------------------------------------------------

	protected ShardStoresResponse(Builder builder) {

		this.indices = Objects.requireNonNull(builder.indices, "indices");

	}

	/**
	 * API name: {@code indices}
	 */
	public Map<String, IndicesShardStores> indices() {
		return this.indices;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("indices");
		generator.writeStartObject();
		for (Map.Entry<String, IndicesShardStores> item0 : this.indices.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().toJsonp(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardStoresResponse}.
	 */
	public static class Builder implements ObjectBuilder<ShardStoresResponse> {
		private Map<String, IndicesShardStores> indices;

		/**
		 * API name: {@code indices}
		 */
		public Builder indices(Map<String, IndicesShardStores> value) {
			this.indices = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #indices(Map)}, creating the map if needed.
		 */
		public Builder putIndices(String key, IndicesShardStores value) {
			if (this.indices == null) {
				this.indices = new HashMap<>();
			}
			this.indices.put(key, value);
			return this;
		}

		/**
		 * Set {@link #indices(Map)} to a singleton map.
		 */
		public Builder indices(String key, Function<IndicesShardStores.Builder, ObjectBuilder<IndicesShardStores>> fn) {
			return this.indices(Collections.singletonMap(key, fn.apply(new IndicesShardStores.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #indices(Map)}, creating the map if needed.
		 */
		public Builder putIndices(String key,
				Function<IndicesShardStores.Builder, ObjectBuilder<IndicesShardStores>> fn) {
			return this.putIndices(key, fn.apply(new IndicesShardStores.Builder()).build());
		}

		/**
		 * Builds a {@link ShardStoresResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardStoresResponse build() {

			return new ShardStoresResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ShardStoresResponse
	 */
	public static final JsonpDeserializer<ShardStoresResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ShardStoresResponse::setupShardStoresResponseDeserializer);

	protected static void setupShardStoresResponseDeserializer(DelegatingDeserializer<ShardStoresResponse.Builder> op) {

		op.add(Builder::indices, JsonpDeserializer.stringMapDeserializer(IndicesShardStores.DESERIALIZER), "indices");

	}

}
