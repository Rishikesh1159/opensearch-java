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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.BucketSortAggregation
@JsonpDeserializable
public final class BucketSortAggregation extends AggregationBase implements AggregationVariant {
	@Nullable
	private final Integer from;

	@Nullable
	private final GapPolicy gapPolicy;

	@Nullable
	private final Integer size;

	@Nullable
	private final List<JsonValue /* _global.search._types.SortCombinations */> sort;

	// ---------------------------------------------------------------------------------------------

	public BucketSortAggregation(Builder builder) {
		super(builder);

		this.from = builder.from;
		this.gapPolicy = builder.gapPolicy;
		this.size = builder.size;
		this.sort = ModelTypeHelper.unmodifiable(builder.sort);

	}

	public BucketSortAggregation(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link Aggregation} variant type
	 */
	@Override
	public String _variantType() {
		return "bucket_sort";
	}

	/**
	 * API name: {@code from}
	 */
	@Nullable
	public Integer from() {
		return this.from;
	}

	/**
	 * API name: {@code gap_policy}
	 */
	@Nullable
	public GapPolicy gapPolicy() {
		return this.gapPolicy;
	}

	/**
	 * API name: {@code size}
	 */
	@Nullable
	public Integer size() {
		return this.size;
	}

	/**
	 * API name: {@code sort}
	 */
	@Nullable
	public List<JsonValue /* _global.search._types.SortCombinations */> sort() {
		return this.sort;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.from != null) {

			generator.writeKey("from");
			generator.write(this.from);

		}
		if (this.gapPolicy != null) {

			generator.writeKey("gap_policy");
			this.gapPolicy.serialize(generator, mapper);
		}
		if (this.size != null) {

			generator.writeKey("size");
			generator.write(this.size);

		}
		if (this.sort != null) {

			generator.writeKey("sort");
			generator.writeStartArray();
			for (JsonValue /* _global.search._types.SortCombinations */ item0 : this.sort) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link BucketSortAggregation}.
	 */
	public static class Builder extends AggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<BucketSortAggregation> {
		@Nullable
		private Integer from;

		@Nullable
		private GapPolicy gapPolicy;

		@Nullable
		private Integer size;

		@Nullable
		private List<JsonValue /* _global.search._types.SortCombinations */> sort;

		/**
		 * API name: {@code from}
		 */
		public Builder from(@Nullable Integer value) {
			this.from = value;
			return this;
		}

		/**
		 * API name: {@code gap_policy}
		 */
		public Builder gapPolicy(@Nullable GapPolicy value) {
			this.gapPolicy = value;
			return this;
		}

		/**
		 * API name: {@code size}
		 */
		public Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * API name: {@code sort}
		 */
		public Builder sort(@Nullable List<JsonValue /* _global.search._types.SortCombinations */> value) {
			this.sort = value;
			return this;
		}

		/**
		 * API name: {@code sort}
		 */
		public Builder sort(JsonValue /* _global.search._types.SortCombinations */... value) {
			this.sort = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #sort(List)}, creating the list if needed. 4
		 */
		public Builder addSort(JsonValue /* _global.search._types.SortCombinations */ value) {
			if (this.sort == null) {
				this.sort = new ArrayList<>();
			}
			this.sort.add(value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link BucketSortAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public BucketSortAggregation build() {

			return new BucketSortAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link BucketSortAggregation}
	 */
	public static final JsonpDeserializer<BucketSortAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, BucketSortAggregation::setupBucketSortAggregationDeserializer, Builder::build);

	protected static void setupBucketSortAggregationDeserializer(
			DelegatingDeserializer<BucketSortAggregation.Builder> op) {
		AggregationBase.setupAggregationBaseDeserializer(op);
		op.add(Builder::from, JsonpDeserializer.integerDeserializer(), "from");
		op.add(Builder::gapPolicy, GapPolicy._DESERIALIZER, "gap_policy");
		op.add(Builder::size, JsonpDeserializer.integerDeserializer(), "size");
		op.add(Builder::sort, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.jsonValueDeserializer()), "sort");

	}

}