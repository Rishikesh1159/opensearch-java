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

package org.opensearch.client.opensearch._global;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ToJsonp;
import org.opensearch.client.util.ObjectBuilder;

import java.util.Objects;

// typedef: _global.clear_scroll.Response
public final class ClearScrollResponse implements ToJsonp {
	private final Boolean succeeded;

	private final Number numFreed;

	// ---------------------------------------------------------------------------------------------

	protected ClearScrollResponse(Builder builder) {

		this.succeeded = Objects.requireNonNull(builder.succeeded, "succeeded");
		this.numFreed = Objects.requireNonNull(builder.numFreed, "num_freed");

	}

	/**
	 * API name: {@code succeeded}
	 */
	public Boolean succeeded() {
		return this.succeeded;
	}

	/**
	 * API name: {@code num_freed}
	 */
	public Number numFreed() {
		return this.numFreed;
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

		generator.writeKey("succeeded");
		generator.write(this.succeeded);

		generator.writeKey("num_freed");
		generator.write(this.numFreed.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClearScrollResponse}.
	 */
	public static class Builder implements ObjectBuilder<ClearScrollResponse> {
		private Boolean succeeded;

		private Number numFreed;

		/**
		 * API name: {@code succeeded}
		 */
		public Builder succeeded(Boolean value) {
			this.succeeded = value;
			return this;
		}

		/**
		 * API name: {@code num_freed}
		 */
		public Builder numFreed(Number value) {
			this.numFreed = value;
			return this;
		}

		/**
		 * Builds a {@link ClearScrollResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClearScrollResponse build() {

			return new ClearScrollResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ClearScrollResponse
	 */
	public static final JsonpDeserializer<ClearScrollResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ClearScrollResponse::setupClearScrollResponseDeserializer);

	protected static void setupClearScrollResponseDeserializer(DelegatingDeserializer<ClearScrollResponse.Builder> op) {

		op.add(Builder::succeeded, JsonpDeserializer.booleanDeserializer(), "succeeded");
		op.add(Builder::numFreed, JsonpDeserializer.numberDeserializer(), "num_freed");

	}

}
