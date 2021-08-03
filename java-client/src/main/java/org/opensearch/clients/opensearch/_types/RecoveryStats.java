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

package org.opensearch.clients.opensearch._types;

import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.JsonpSerializable;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.util.ModelTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import org.opensearch.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.RecoveryStats
@JsonpDeserializable
public class RecoveryStats implements JsonpSerializable {
	private final long currentAsSource;

	private final long currentAsTarget;

	@Nullable
	private final String throttleTime;

	private final long throttleTimeInMillis;

	// ---------------------------------------------------------------------------------------------

	private RecoveryStats(Builder builder) {

		this.currentAsSource = ModelTypeHelper.requireNonNull(builder.currentAsSource, this, "currentAsSource");
		this.currentAsTarget = ModelTypeHelper.requireNonNull(builder.currentAsTarget, this, "currentAsTarget");
		this.throttleTime = builder.throttleTime;
		this.throttleTimeInMillis = ModelTypeHelper.requireNonNull(builder.throttleTimeInMillis, this,
				"throttleTimeInMillis");

	}

	public static RecoveryStats of(Function<Builder, ObjectBuilder<RecoveryStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code current_as_source}
	 */
	public final long currentAsSource() {
		return this.currentAsSource;
	}

	/**
	 * Required - API name: {@code current_as_target}
	 */
	public final long currentAsTarget() {
		return this.currentAsTarget;
	}

	/**
	 * API name: {@code throttle_time}
	 */
	@Nullable
	public final String throttleTime() {
		return this.throttleTime;
	}

	/**
	 * Required - API name: {@code throttle_time_in_millis}
	 */
	public final long throttleTimeInMillis() {
		return this.throttleTimeInMillis;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("current_as_source");
		generator.write(this.currentAsSource);

		generator.writeKey("current_as_target");
		generator.write(this.currentAsTarget);

		if (this.throttleTime != null) {
			generator.writeKey("throttle_time");
			generator.write(this.throttleTime);

		}
		generator.writeKey("throttle_time_in_millis");
		generator.write(this.throttleTimeInMillis);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RecoveryStats}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<RecoveryStats> {
		private Long currentAsSource;

		private Long currentAsTarget;

		@Nullable
		private String throttleTime;

		private Long throttleTimeInMillis;

		/**
		 * Required - API name: {@code current_as_source}
		 */
		public final Builder currentAsSource(long value) {
			this.currentAsSource = value;
			return this;
		}

		/**
		 * Required - API name: {@code current_as_target}
		 */
		public final Builder currentAsTarget(long value) {
			this.currentAsTarget = value;
			return this;
		}

		/**
		 * API name: {@code throttle_time}
		 */
		public final Builder throttleTime(@Nullable String value) {
			this.throttleTime = value;
			return this;
		}

		/**
		 * Required - API name: {@code throttle_time_in_millis}
		 */
		public final Builder throttleTimeInMillis(long value) {
			this.throttleTimeInMillis = value;
			return this;
		}

		/**
		 * Builds a {@link RecoveryStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RecoveryStats build() {
			_checkSingleUse();

			return new RecoveryStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RecoveryStats}
	 */
	public static final JsonpDeserializer<RecoveryStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RecoveryStats::setupRecoveryStatsDeserializer, Builder::build);

	protected static void setupRecoveryStatsDeserializer(DelegatingDeserializer<RecoveryStats.Builder> op) {

		op.add(Builder::currentAsSource, JsonpDeserializer.longDeserializer(), "current_as_source");
		op.add(Builder::currentAsTarget, JsonpDeserializer.longDeserializer(), "current_as_target");
		op.add(Builder::throttleTime, JsonpDeserializer.stringDeserializer(), "throttle_time");
		op.add(Builder::throttleTimeInMillis, JsonpDeserializer.longDeserializer(), "throttle_time_in_millis");

	}

}