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

package org.opensearch.client.opensearch.ingest;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ToJsonp;
import org.opensearch.client.util.ObjectBuilder;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

// typedef: ingest.processor_grok.Response
public final class ProcessorGrokResponse implements ToJsonp {
	private final Map<String, String> patterns;

	// ---------------------------------------------------------------------------------------------

	protected ProcessorGrokResponse(Builder builder) {

		this.patterns = Objects.requireNonNull(builder.patterns, "patterns");

	}

	/**
	 * API name: {@code patterns}
	 */
	public Map<String, String> patterns() {
		return this.patterns;
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

		generator.writeKey("patterns");
		generator.writeStartObject();
		for (Map.Entry<String, String> item0 : this.patterns.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.write(item0.getValue());

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ProcessorGrokResponse}.
	 */
	public static class Builder implements ObjectBuilder<ProcessorGrokResponse> {
		private Map<String, String> patterns;

		/**
		 * API name: {@code patterns}
		 */
		public Builder patterns(Map<String, String> value) {
			this.patterns = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #patterns(Map)}, creating the map if needed.
		 */
		public Builder putPatterns(String key, String value) {
			if (this.patterns == null) {
				this.patterns = new HashMap<>();
			}
			this.patterns.put(key, value);
			return this;
		}

		/**
		 * Builds a {@link ProcessorGrokResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ProcessorGrokResponse build() {

			return new ProcessorGrokResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ProcessorGrokResponse
	 */
	public static final JsonpDeserializer<ProcessorGrokResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ProcessorGrokResponse::setupProcessorGrokResponseDeserializer);

	protected static void setupProcessorGrokResponseDeserializer(
			DelegatingDeserializer<ProcessorGrokResponse.Builder> op) {

		op.add(Builder::patterns, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"patterns");

	}

}
