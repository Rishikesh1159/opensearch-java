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

package org.opensearch.clients.opensearch.core.search;

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
import java.lang.Integer;
import java.lang.String;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.NestedIdentity
@JsonpDeserializable
public class NestedIdentity implements JsonpSerializable {
	private final String field;

	private final int offset;

	@Nullable
	private final NestedIdentity nested;

	// ---------------------------------------------------------------------------------------------

	private NestedIdentity(Builder builder) {

		this.field = ModelTypeHelper.requireNonNull(builder.field, this, "field");
		this.offset = ModelTypeHelper.requireNonNull(builder.offset, this, "offset");
		this.nested = builder.nested;

	}

	public static NestedIdentity of(Function<Builder, ObjectBuilder<NestedIdentity>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Required - API name: {@code offset}
	 */
	public final int offset() {
		return this.offset;
	}

	/**
	 * API name: {@code _nested}
	 */
	@Nullable
	public final NestedIdentity nested() {
		return this.nested;
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

		generator.writeKey("field");
		generator.write(this.field);

		generator.writeKey("offset");
		generator.write(this.offset);

		if (this.nested != null) {
			generator.writeKey("_nested");
			this.nested.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NestedIdentity}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<NestedIdentity> {
		private String field;

		private Integer offset;

		@Nullable
		private NestedIdentity nested;

		/**
		 * Required - API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Required - API name: {@code offset}
		 */
		public final Builder offset(int value) {
			this.offset = value;
			return this;
		}

		/**
		 * API name: {@code _nested}
		 */
		public final Builder nested(@Nullable NestedIdentity value) {
			this.nested = value;
			return this;
		}

		/**
		 * API name: {@code _nested}
		 */
		public final Builder nested(Function<NestedIdentity.Builder, ObjectBuilder<NestedIdentity>> fn) {
			return this.nested(fn.apply(new NestedIdentity.Builder()).build());
		}

		/**
		 * Builds a {@link NestedIdentity}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NestedIdentity build() {
			_checkSingleUse();

			return new NestedIdentity(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NestedIdentity}
	 */
	public static final JsonpDeserializer<NestedIdentity> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			NestedIdentity::setupNestedIdentityDeserializer, Builder::build);

	protected static void setupNestedIdentityDeserializer(DelegatingDeserializer<NestedIdentity.Builder> op) {

		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::offset, JsonpDeserializer.integerDeserializer(), "offset");
		op.add(Builder::nested, NestedIdentity._DESERIALIZER, "_nested");

	}

}