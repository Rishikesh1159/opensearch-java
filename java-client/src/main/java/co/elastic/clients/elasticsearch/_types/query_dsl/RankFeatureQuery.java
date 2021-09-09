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

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.RankFeatureQuery
public final class RankFeatureQuery extends QueryBase {
	private final String field;

	@Nullable
	private final RankFeatureFunctionSaturation saturation;

	@Nullable
	private final RankFeatureFunctionLogarithm log;

	@Nullable
	private final JsonValue linear;

	@Nullable
	private final RankFeatureFunctionSigmoid sigmoid;

	// ---------------------------------------------------------------------------------------------

	protected RankFeatureQuery(Builder builder) {
		super(builder);
		this.field = Objects.requireNonNull(builder.field, "field");
		this.saturation = builder.saturation;
		this.log = builder.log;
		this.linear = builder.linear;
		this.sigmoid = builder.sigmoid;

	}

	/**
	 * API name: {@code field}
	 */
	public String field() {
		return this.field;
	}

	/**
	 * API name: {@code saturation}
	 */
	@Nullable
	public RankFeatureFunctionSaturation saturation() {
		return this.saturation;
	}

	/**
	 * API name: {@code log}
	 */
	@Nullable
	public RankFeatureFunctionLogarithm log() {
		return this.log;
	}

	/**
	 * API name: {@code linear}
	 */
	@Nullable
	public JsonValue linear() {
		return this.linear;
	}

	/**
	 * API name: {@code sigmoid}
	 */
	@Nullable
	public RankFeatureFunctionSigmoid sigmoid() {
		return this.sigmoid;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);

		generator.writeKey("field");
		generator.write(this.field);

		if (this.saturation != null) {

			generator.writeKey("saturation");
			this.saturation.toJsonp(generator, mapper);

		}
		if (this.log != null) {

			generator.writeKey("log");
			this.log.toJsonp(generator, mapper);

		}
		if (this.linear != null) {

			generator.writeKey("linear");
			generator.write(this.linear);

		}
		if (this.sigmoid != null) {

			generator.writeKey("sigmoid");
			this.sigmoid.toJsonp(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RankFeatureQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<RankFeatureQuery> {
		private String field;

		@Nullable
		private RankFeatureFunctionSaturation saturation;

		@Nullable
		private RankFeatureFunctionLogarithm log;

		@Nullable
		private JsonValue linear;

		@Nullable
		private RankFeatureFunctionSigmoid sigmoid;

		/**
		 * API name: {@code field}
		 */
		public Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code saturation}
		 */
		public Builder saturation(@Nullable RankFeatureFunctionSaturation value) {
			this.saturation = value;
			return this;
		}

		/**
		 * API name: {@code saturation}
		 */
		public Builder saturation(
				Function<RankFeatureFunctionSaturation.Builder, ObjectBuilder<RankFeatureFunctionSaturation>> fn) {
			return this.saturation(fn.apply(new RankFeatureFunctionSaturation.Builder()).build());
		}

		/**
		 * API name: {@code log}
		 */
		public Builder log(@Nullable RankFeatureFunctionLogarithm value) {
			this.log = value;
			return this;
		}

		/**
		 * API name: {@code log}
		 */
		public Builder log(
				Function<RankFeatureFunctionLogarithm.Builder, ObjectBuilder<RankFeatureFunctionLogarithm>> fn) {
			return this.log(fn.apply(new RankFeatureFunctionLogarithm.Builder()).build());
		}

		/**
		 * API name: {@code linear}
		 */
		public Builder linear(@Nullable JsonValue value) {
			this.linear = value;
			return this;
		}

		/**
		 * API name: {@code sigmoid}
		 */
		public Builder sigmoid(@Nullable RankFeatureFunctionSigmoid value) {
			this.sigmoid = value;
			return this;
		}

		/**
		 * API name: {@code sigmoid}
		 */
		public Builder sigmoid(
				Function<RankFeatureFunctionSigmoid.Builder, ObjectBuilder<RankFeatureFunctionSigmoid>> fn) {
			return this.sigmoid(fn.apply(new RankFeatureFunctionSigmoid.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RankFeatureQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RankFeatureQuery build() {

			return new RankFeatureQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for RankFeatureQuery
	 */
	public static final JsonpDeserializer<RankFeatureQuery> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, RankFeatureQuery::setupRankFeatureQueryDeserializer);

	protected static void setupRankFeatureQueryDeserializer(DelegatingDeserializer<RankFeatureQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::saturation, RankFeatureFunctionSaturation.DESERIALIZER, "saturation");
		op.add(Builder::log, RankFeatureFunctionLogarithm.DESERIALIZER, "log");
		op.add(Builder::linear, JsonpDeserializer.jsonValueDeserializer(), "linear");
		op.add(Builder::sigmoid, RankFeatureFunctionSigmoid.DESERIALIZER, "sigmoid");

	}

}