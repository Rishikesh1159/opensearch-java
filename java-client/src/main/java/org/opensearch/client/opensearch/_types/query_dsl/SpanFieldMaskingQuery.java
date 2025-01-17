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

package org.opensearch.client.opensearch._types.query_dsl;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.util.ObjectBuilder;

import javax.annotation.Nullable;
import java.util.function.Function;

// typedef: _types.query_dsl.SpanFieldMaskingQuery
public final class SpanFieldMaskingQuery extends QueryBase {
	@Nullable
	private final String field;

	@Nullable
	private final SpanQuery query;

	// ---------------------------------------------------------------------------------------------

	protected SpanFieldMaskingQuery(Builder builder) {
		super(builder);
		this.field = builder.field;
		this.query = builder.query;

	}

	/**
	 * API name: {@code field}
	 */
	@Nullable
	public String field() {
		return this.field;
	}

	/**
	 * API name: {@code query}
	 */
	@Nullable
	public SpanQuery query() {
		return this.query;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.field != null) {

			generator.writeKey("field");
			generator.write(this.field);

		}
		if (this.query != null) {

			generator.writeKey("query");
			this.query.toJsonp(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SpanFieldMaskingQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<SpanFieldMaskingQuery> {
		@Nullable
		private String field;

		@Nullable
		private SpanQuery query;

		/**
		 * API name: {@code field}
		 */
		public Builder field(@Nullable String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code query}
		 */
		public Builder query(@Nullable SpanQuery value) {
			this.query = value;
			return this;
		}

		/**
		 * API name: {@code query}
		 */
		public Builder query(Function<SpanQuery.Builder, ObjectBuilder<SpanQuery>> fn) {
			return this.query(fn.apply(new SpanQuery.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SpanFieldMaskingQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SpanFieldMaskingQuery build() {

			return new SpanFieldMaskingQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for SpanFieldMaskingQuery
	 */
	public static final JsonpDeserializer<SpanFieldMaskingQuery> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, SpanFieldMaskingQuery::setupSpanFieldMaskingQueryDeserializer);

	protected static void setupSpanFieldMaskingQueryDeserializer(
			DelegatingDeserializer<SpanFieldMaskingQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::query, SpanQuery.DESERIALIZER, "query");

	}

}
