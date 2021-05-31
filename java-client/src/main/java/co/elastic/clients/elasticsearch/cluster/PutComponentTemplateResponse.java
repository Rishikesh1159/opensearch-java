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

package co.elastic.clients.elasticsearch.cluster;

import co.elastic.clients.elasticsearch._types.AcknowledgedResponseBase;
import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;

// typedef: cluster.put_component_template.Response
public final class PutComponentTemplateResponse extends AcknowledgedResponseBase {
	// ---------------------------------------------------------------------------------------------

	protected PutComponentTemplateResponse(Builder builder) {
		super(builder);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutComponentTemplateResponse}.
	 */
	public static class Builder extends AcknowledgedResponseBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutComponentTemplateResponse> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutComponentTemplateResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutComponentTemplateResponse build() {

			return new PutComponentTemplateResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for PutComponentTemplateResponse
	 */
	public static final JsonpValueParser<PutComponentTemplateResponse> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, PutComponentTemplateResponse::setupPutComponentTemplateResponseParser);

	protected static void setupPutComponentTemplateResponseParser(
			DelegatingJsonpValueParser<PutComponentTemplateResponse.Builder> op) {
		AcknowledgedResponseBase.setupAcknowledgedResponseBaseParser(op);

	}

}