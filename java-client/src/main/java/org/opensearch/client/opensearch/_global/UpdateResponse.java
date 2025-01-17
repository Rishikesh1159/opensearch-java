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
import org.opensearch.client.opensearch._types.InlineGet;
import org.opensearch.client.opensearch._types.WriteResponseBase;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.JsonpSerializer;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.util.ObjectBuilder;

import javax.annotation.Nullable;
import java.util.function.Function;
import java.util.function.Supplier;

// typedef: _global.update.Response
public final class UpdateResponse<TDocument> extends WriteResponseBase {
	@Nullable
	private final InlineGet<TDocument> get;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	protected UpdateResponse(Builder<TDocument> builder) {
		super(builder);
		this.get = builder.get;
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	/**
	 * API name: {@code get}
	 */
	@Nullable
	public InlineGet<TDocument> get() {
		return this.get;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.get != null) {

			generator.writeKey("get");
			this.get.toJsonp(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UpdateResponse}.
	 */
	public static class Builder<TDocument> extends WriteResponseBase.AbstractBuilder<Builder<TDocument>>
			implements
				ObjectBuilder<UpdateResponse<TDocument>> {
		@Nullable
		private InlineGet<TDocument> get;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

		/**
		 * API name: {@code get}
		 */
		public Builder<TDocument> get(@Nullable InlineGet<TDocument> value) {
			this.get = value;
			return this;
		}

		/**
		 * API name: {@code get}
		 */
		public Builder<TDocument> get(Function<InlineGet.Builder<TDocument>, ObjectBuilder<InlineGet<TDocument>>> fn) {
			return this.get(fn.apply(new InlineGet.Builder<TDocument>()).build());
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

		@Override
		protected Builder<TDocument> self() {
			return this;
		}

		/**
		 * Builds a {@link UpdateResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpdateResponse<TDocument> build() {

			return new UpdateResponse<TDocument>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a json deserializer for UpdateResponse
	 */
	public static <TDocument> JsonpDeserializer<UpdateResponse<TDocument>> createUpdateResponseDeserializer(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TDocument>>) Builder::new,
				op -> UpdateResponse.setupUpdateResponseDeserializer(op, tDocumentDeserializer));
	};

	protected static <TDocument> void setupUpdateResponseDeserializer(
			DelegatingDeserializer<UpdateResponse.Builder<TDocument>> op,
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		WriteResponseBase.setupWriteResponseBaseDeserializer(op);
		op.add(Builder::get, InlineGet.createInlineGetDeserializer(tDocumentDeserializer), "get");

	}

}
