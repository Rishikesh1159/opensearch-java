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

package org.opensearch.clients.opensearch.core;

import org.opensearch.clients.opensearch._types.ErrorResponse;
import org.opensearch.clients.opensearch._types.RequestBase;
import org.opensearch.clients.transport.BooleanEndpoint;
import org.opensearch.clients.transport.BooleanResponse;
import org.opensearch.clients.transport.Endpoint;
import org.opensearch.clients.transport.SimpleEndpoint;

import java.util.Collections;

// typedef: _global.ping.Request

public class PingRequest extends RequestBase {
	public PingRequest() {
	}

	/**
	 * Singleton instance for {@link PingRequest}.
	 */
	public static final PingRequest _INSTANCE = new PingRequest();

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ping}".
	 */
	public static final Endpoint<PingRequest, BooleanResponse, ErrorResponse> ENDPOINT = new BooleanEndpoint<>(
			// Request method
			request -> {
				return "HEAD";

			},

			// Request path
			request -> {
				return "/";

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, null);
}