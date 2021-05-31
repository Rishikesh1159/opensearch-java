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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.transform;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import javax.annotation.Nullable;

// typedef: transform.update_transform.Request
public final class UpdateTransformRequest extends PutTransformRequest {
	@Nullable
	private final String transformId;

	// ---------------------------------------------------------------------------------------------

	protected UpdateTransformRequest(Builder builder) {
		super(builder);
		this.transformId = builder.transformId;

	}

	/**
	 * Auto generated - missing in the input spec
	 *
	 * API name: {@code transform_id}
	 */
	@Nullable
	public String transformId() {
		return this.transformId;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UpdateTransformRequest}.
	 */
	public static class Builder extends PutTransformRequest.AbstractBuilder<Builder>
			implements
				ObjectBuilder<UpdateTransformRequest> {
		@Nullable
		private String transformId;

		/**
		 * Auto generated - missing in the input spec
		 *
		 * API name: {@code transform_id}
		 */
		public Builder transformId(@Nullable String value) {
			this.transformId = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link UpdateTransformRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpdateTransformRequest build() {

			return new UpdateTransformRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for UpdateTransformRequest
	 */
	public static final JsonpValueParser<UpdateTransformRequest> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, UpdateTransformRequest::setupUpdateTransformRequestParser);

	protected static void setupUpdateTransformRequestParser(
			DelegatingJsonpValueParser<UpdateTransformRequest.Builder> op) {
		PutTransformRequest.setupPutTransformRequestParser(op);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code transform.update_transform}".
	 */
	public static final Endpoint<UpdateTransformRequest, UpdateTransformResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> "POST",

			// Request path
			request -> {
				StringBuilder buf = new StringBuilder();
				buf.append("/_transform");
				if (request.transformId != null) {
					buf.append("/");
					buf.append(request.transformId);
				}
				buf.append("/_update");
				return buf.toString();

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), true, UpdateTransformResponse.JSONP_PARSER);
}