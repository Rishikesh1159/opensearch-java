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

package org.opensearch.client.opensearch._types.aggregations;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ToJsonp;
import org.opensearch.client.util.ObjectBuilder;

import javax.annotation.Nullable;
import java.util.function.Function;

// typedef: _types.aggregations.CompositeAggregationSource
public final class CompositeAggregationSource implements ToJsonp {
	@Nullable
	private final TermsAggregation terms;

	@Nullable
	private final HistogramAggregation histogram;

	@Nullable
	private final DateHistogramAggregation dateHistogram;

	@Nullable
	private final GeoTileGridAggregation geotileGrid;

	// ---------------------------------------------------------------------------------------------

	protected CompositeAggregationSource(Builder builder) {

		this.terms = builder.terms;
		this.histogram = builder.histogram;
		this.dateHistogram = builder.dateHistogram;
		this.geotileGrid = builder.geotileGrid;

	}

	/**
	 * API name: {@code terms}
	 */
	@Nullable
	public TermsAggregation terms() {
		return this.terms;
	}

	/**
	 * API name: {@code histogram}
	 */
	@Nullable
	public HistogramAggregation histogram() {
		return this.histogram;
	}

	/**
	 * API name: {@code date_histogram}
	 */
	@Nullable
	public DateHistogramAggregation dateHistogram() {
		return this.dateHistogram;
	}

	/**
	 * API name: {@code geotile_grid}
	 */
	@Nullable
	public GeoTileGridAggregation geotileGrid() {
		return this.geotileGrid;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.terms != null) {

			generator.writeKey("terms");
			this.terms.toJsonp(generator, mapper);

		}
		if (this.histogram != null) {

			generator.writeKey("histogram");
			this.histogram.toJsonp(generator, mapper);

		}
		if (this.dateHistogram != null) {

			generator.writeKey("date_histogram");
			this.dateHistogram.toJsonp(generator, mapper);

		}
		if (this.geotileGrid != null) {

			generator.writeKey("geotile_grid");
			this.geotileGrid.toJsonp(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CompositeAggregationSource}.
	 */
	public static class Builder implements ObjectBuilder<CompositeAggregationSource> {
		@Nullable
		private TermsAggregation terms;

		@Nullable
		private HistogramAggregation histogram;

		@Nullable
		private DateHistogramAggregation dateHistogram;

		@Nullable
		private GeoTileGridAggregation geotileGrid;

		/**
		 * API name: {@code terms}
		 */
		public Builder terms(@Nullable TermsAggregation value) {
			this.terms = value;
			return this;
		}

		/**
		 * API name: {@code terms}
		 */
		public Builder terms(Function<TermsAggregation.Builder, ObjectBuilder<TermsAggregation>> fn) {
			return this.terms(fn.apply(new TermsAggregation.Builder()).build());
		}

		/**
		 * API name: {@code histogram}
		 */
		public Builder histogram(@Nullable HistogramAggregation value) {
			this.histogram = value;
			return this;
		}

		/**
		 * API name: {@code histogram}
		 */
		public Builder histogram(Function<HistogramAggregation.Builder, ObjectBuilder<HistogramAggregation>> fn) {
			return this.histogram(fn.apply(new HistogramAggregation.Builder()).build());
		}

		/**
		 * API name: {@code date_histogram}
		 */
		public Builder dateHistogram(@Nullable DateHistogramAggregation value) {
			this.dateHistogram = value;
			return this;
		}

		/**
		 * API name: {@code date_histogram}
		 */
		public Builder dateHistogram(
				Function<DateHistogramAggregation.Builder, ObjectBuilder<DateHistogramAggregation>> fn) {
			return this.dateHistogram(fn.apply(new DateHistogramAggregation.Builder()).build());
		}

		/**
		 * API name: {@code geotile_grid}
		 */
		public Builder geotileGrid(@Nullable GeoTileGridAggregation value) {
			this.geotileGrid = value;
			return this;
		}

		/**
		 * API name: {@code geotile_grid}
		 */
		public Builder geotileGrid(Function<GeoTileGridAggregation.Builder, ObjectBuilder<GeoTileGridAggregation>> fn) {
			return this.geotileGrid(fn.apply(new GeoTileGridAggregation.Builder()).build());
		}

		/**
		 * Builds a {@link CompositeAggregationSource}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CompositeAggregationSource build() {

			return new CompositeAggregationSource(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for CompositeAggregationSource
	 */
	public static final JsonpDeserializer<CompositeAggregationSource> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, CompositeAggregationSource::setupCompositeAggregationSourceDeserializer);

	protected static void setupCompositeAggregationSourceDeserializer(
			DelegatingDeserializer<CompositeAggregationSource.Builder> op) {

		op.add(Builder::terms, TermsAggregation.DESERIALIZER, "terms");
		op.add(Builder::histogram, HistogramAggregation.DESERIALIZER, "histogram");
		op.add(Builder::dateHistogram, DateHistogramAggregation.DESERIALIZER, "date_histogram");
		op.add(Builder::geotileGrid, GeoTileGridAggregation.DESERIALIZER, "geotile_grid");

	}

}
