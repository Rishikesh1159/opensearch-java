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

package org.opensearch.client.opensearch.cluster.stats;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ToJsonp;
import org.opensearch.client.util.ObjectBuilder;

import java.util.Objects;

// typedef: cluster.stats.NodePackagingType
public final class NodePackagingType implements ToJsonp {
	private final Number count;

	private final String flavor;

	private final String type;

	// ---------------------------------------------------------------------------------------------

	protected NodePackagingType(Builder builder) {

		this.count = Objects.requireNonNull(builder.count, "count");
		this.flavor = Objects.requireNonNull(builder.flavor, "flavor");
		this.type = Objects.requireNonNull(builder.type, "type");

	}

	/**
	 * API name: {@code count}
	 */
	public Number count() {
		return this.count;
	}

	/**
	 * API name: {@code flavor}
	 */
	public String flavor() {
		return this.flavor;
	}

	/**
	 * API name: {@code type}
	 */
	public String type() {
		return this.type;
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

		generator.writeKey("count");
		generator.write(this.count.doubleValue());

		generator.writeKey("flavor");
		generator.write(this.flavor);

		generator.writeKey("type");
		generator.write(this.type);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodePackagingType}.
	 */
	public static class Builder implements ObjectBuilder<NodePackagingType> {
		private Number count;

		private String flavor;

		private String type;

		/**
		 * API name: {@code count}
		 */
		public Builder count(Number value) {
			this.count = value;
			return this;
		}

		/**
		 * API name: {@code flavor}
		 */
		public Builder flavor(String value) {
			this.flavor = value;
			return this;
		}

		/**
		 * API name: {@code type}
		 */
		public Builder type(String value) {
			this.type = value;
			return this;
		}

		/**
		 * Builds a {@link NodePackagingType}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodePackagingType build() {

			return new NodePackagingType(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for NodePackagingType
	 */
	public static final JsonpDeserializer<NodePackagingType> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, NodePackagingType::setupNodePackagingTypeDeserializer);

	protected static void setupNodePackagingTypeDeserializer(DelegatingDeserializer<NodePackagingType.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.numberDeserializer(), "count");
		op.add(Builder::flavor, JsonpDeserializer.stringDeserializer(), "flavor");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");

	}

}
