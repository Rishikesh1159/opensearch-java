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
import org.opensearch.client.json.JsonpSerializer;
import org.opensearch.client.json.JsonpUtils;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ToJsonp;
import org.opensearch.client.util.ObjectBuilder;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.function.Supplier;

// typedef: _global.get_source.Response
public final class GetSourceResponse<TDocument> implements ToJsonp {
	private final TDocument value;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	protected GetSourceResponse(Builder<TDocument> builder) {

		this.value = Objects.requireNonNull(builder.value, "value");
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	/**
	 * Response value.
	 *
	 * API name: {@code value}
	 */
	public TDocument value() {
		return this.value;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		JsonpUtils.serialize(this.value, generator, tDocumentSerializer, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetSourceResponse}.
	 */
	public static class Builder<TDocument> implements ObjectBuilder<GetSourceResponse<TDocument>> {
		private TDocument value;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

		/**
		 * Response value.
		 *
		 * API name: {@code value}
		 */
		public Builder<TDocument> value(TDocument value) {
			this.value = value;
			return this;
		}

		/**
		 * Serializer for TDocument. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 *
		 */
		public Builder<TDocument> tDocumentSerializer(@Nullable JsonpSerializer<TDocument> value) {
			this.tDocumentSerializer = value;
			return this;
		}

		/**
		 * Builds a {@link GetSourceResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetSourceResponse<TDocument> build() {

			return new GetSourceResponse<TDocument>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a json deserializer for GetSourceResponse
	 */
	public static <TDocument> JsonpDeserializer<GetSourceResponse<TDocument>> createGetSourceResponseDeserializer(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ObjectBuilderDeserializer.createForValue((Supplier<Builder<TDocument>>) Builder::new,
				op -> GetSourceResponse.setupGetSourceResponseDeserializer(op, tDocumentDeserializer));
	};

	protected static <TDocument> void setupGetSourceResponseDeserializer(
			DelegatingDeserializer<GetSourceResponse.Builder<TDocument>> op,
			JsonpDeserializer<TDocument> tDocumentDeserializer) {

		op.add(Builder::value, tDocumentDeserializer, "value");

	}

}
