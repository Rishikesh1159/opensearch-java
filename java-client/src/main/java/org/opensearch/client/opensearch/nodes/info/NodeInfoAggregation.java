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

package org.opensearch.client.opensearch.nodes.info;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ToJsonp;
import org.opensearch.client.util.ObjectBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

// typedef: nodes.info.NodeInfoAggregation
public final class NodeInfoAggregation implements ToJsonp {
	private final List<String> types;

	// ---------------------------------------------------------------------------------------------

	protected NodeInfoAggregation(Builder builder) {

		this.types = Objects.requireNonNull(builder.types, "types");

	}

	/**
	 * API name: {@code types}
	 */
	public List<String> types() {
		return this.types;
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

		generator.writeKey("types");
		generator.writeStartArray();
		for (String item0 : this.types) {
			generator.write(item0);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoAggregation}.
	 */
	public static class Builder implements ObjectBuilder<NodeInfoAggregation> {
		private List<String> types;

		/**
		 * API name: {@code types}
		 */
		public Builder types(List<String> value) {
			this.types = value;
			return this;
		}

		/**
		 * API name: {@code types}
		 */
		public Builder types(String... value) {
			this.types = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #types(List)}, creating the list if needed.
		 */
		public Builder addTypes(String value) {
			if (this.types == null) {
				this.types = new ArrayList<>();
			}
			this.types.add(value);
			return this;
		}

		/**
		 * Builds a {@link NodeInfoAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoAggregation build() {

			return new NodeInfoAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for NodeInfoAggregation
	 */
	public static final JsonpDeserializer<NodeInfoAggregation> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, NodeInfoAggregation::setupNodeInfoAggregationDeserializer);

	protected static void setupNodeInfoAggregationDeserializer(DelegatingDeserializer<NodeInfoAggregation.Builder> op) {

		op.add(Builder::types, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "types");

	}

}
