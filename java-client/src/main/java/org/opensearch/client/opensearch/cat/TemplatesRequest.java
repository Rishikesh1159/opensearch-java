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

import org.opensearch.client.base.OpenSearchError;
import org.opensearch.client.base.Endpoint;
import org.opensearch.client.util.ObjectBuilder;

import javax.annotation.Nullable;
import java.util.Collections;

// typedef: cat.templates.Request
public final class TemplatesRequest extends CatRequestBase {
	@Nullable
	private final String name;

	// ---------------------------------------------------------------------------------------------

	protected TemplatesRequest(Builder builder) {

		this.name = builder.name;

	}

	/**
	 * API name: {@code name}
	 */
	@Nullable
	public String name() {
		return this.name;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TemplatesRequest}.
	 */
	public static class Builder implements ObjectBuilder<TemplatesRequest> {
		@Nullable
		private String name;

		/**
		 * API name: {@code name}
		 */
		public Builder name(@Nullable String value) {
			this.name = value;
			return this;
		}

		/**
		 * Builds a {@link TemplatesRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TemplatesRequest build() {

			return new TemplatesRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cat.templates}".
	 */
	public static final Endpoint<TemplatesRequest, TemplatesResponse, OpenSearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;

				int propsSet = 0;

				if (request.name() != null)
					propsSet |= _name;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_cat");
					buf.append("/templates");
					return buf.toString();
				}
				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_cat");
					buf.append("/templates");
					buf.append("/");
					buf.append(request.name);
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), false, TemplatesResponse.DESERIALIZER);
}
