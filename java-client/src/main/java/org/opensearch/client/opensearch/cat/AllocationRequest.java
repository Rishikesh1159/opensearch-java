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

package org.opensearch.client.opensearch.cat;

import jakarta.json.JsonValue;
import org.opensearch.client.base.OpenSearchError;
import org.opensearch.client.base.Endpoint;
import org.opensearch.client.util.ObjectBuilder;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

// typedef: cat.allocation.Request
public final class AllocationRequest extends CatRequestBase {
	@Nullable
	private final String nodeId;

	@Nullable
	private final JsonValue bytes;

	// ---------------------------------------------------------------------------------------------

	protected AllocationRequest(Builder builder) {

		this.nodeId = builder.nodeId;
		this.bytes = builder.bytes;

	}

	/**
	 * API name: {@code node_id}
	 */
	@Nullable
	public String nodeId() {
		return this.nodeId;
	}

	/**
	 * API name: {@code bytes}
	 */
	@Nullable
	public JsonValue bytes() {
		return this.bytes;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AllocationRequest}.
	 */
	public static class Builder implements ObjectBuilder<AllocationRequest> {
		@Nullable
		private String nodeId;

		@Nullable
		private JsonValue bytes;

		/**
		 * API name: {@code node_id}
		 */
		public Builder nodeId(@Nullable String value) {
			this.nodeId = value;
			return this;
		}

		/**
		 * API name: {@code bytes}
		 */
		public Builder bytes(@Nullable JsonValue value) {
			this.bytes = value;
			return this;
		}

		/**
		 * Builds a {@link AllocationRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AllocationRequest build() {

			return new AllocationRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cat.allocation}".
	 */
	public static final Endpoint<AllocationRequest, AllocationResponse, OpenSearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _nodeId = 1 << 0;

				int propsSet = 0;

				if (request.nodeId() != null)
					propsSet |= _nodeId;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_cat");
					buf.append("/allocation");
					return buf.toString();
				}
				if (propsSet == (_nodeId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_cat");
					buf.append("/allocation");
					buf.append("/");
					buf.append(request.nodeId);
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.bytes != null) {
					params.put("bytes", request.bytes.toString());
				}
				return params;

			}, Endpoint.Simple.emptyMap(), false, AllocationResponse.DESERIALIZER);
}
