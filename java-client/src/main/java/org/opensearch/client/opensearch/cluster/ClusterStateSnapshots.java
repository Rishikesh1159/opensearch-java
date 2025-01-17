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

package org.opensearch.client.opensearch.cluster;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.opensearch.snapshot.Status;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ToJsonp;
import org.opensearch.client.util.ObjectBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

// typedef: cluster._types.ClusterStateSnapshots
public final class ClusterStateSnapshots implements ToJsonp {
	private final List<Status> snapshots;

	// ---------------------------------------------------------------------------------------------

	protected ClusterStateSnapshots(Builder builder) {

		this.snapshots = Objects.requireNonNull(builder.snapshots, "snapshots");

	}

	/**
	 * API name: {@code snapshots}
	 */
	public List<Status> snapshots() {
		return this.snapshots;
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

		generator.writeKey("snapshots");
		generator.writeStartArray();
		for (Status item0 : this.snapshots) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterStateSnapshots}.
	 */
	public static class Builder implements ObjectBuilder<ClusterStateSnapshots> {
		private List<Status> snapshots;

		/**
		 * API name: {@code snapshots}
		 */
		public Builder snapshots(List<Status> value) {
			this.snapshots = value;
			return this;
		}

		/**
		 * API name: {@code snapshots}
		 */
		public Builder snapshots(Status... value) {
			this.snapshots = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #snapshots(List)}, creating the list if needed.
		 */
		public Builder addSnapshots(Status value) {
			if (this.snapshots == null) {
				this.snapshots = new ArrayList<>();
			}
			this.snapshots.add(value);
			return this;
		}

		/**
		 * Set {@link #snapshots(List)} to a singleton list.
		 */
		public Builder snapshots(Function<Status.Builder, ObjectBuilder<Status>> fn) {
			return this.snapshots(fn.apply(new Status.Builder()).build());
		}

		/**
		 * Add a value to {@link #snapshots(List)}, creating the list if needed.
		 */
		public Builder addSnapshots(Function<Status.Builder, ObjectBuilder<Status>> fn) {
			return this.addSnapshots(fn.apply(new Status.Builder()).build());
		}

		/**
		 * Builds a {@link ClusterStateSnapshots}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterStateSnapshots build() {

			return new ClusterStateSnapshots(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ClusterStateSnapshots
	 */
	public static final JsonpDeserializer<ClusterStateSnapshots> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ClusterStateSnapshots::setupClusterStateSnapshotsDeserializer);

	protected static void setupClusterStateSnapshotsDeserializer(
			DelegatingDeserializer<ClusterStateSnapshots.Builder> op) {

		op.add(Builder::snapshots, JsonpDeserializer.arrayDeserializer(Status.DESERIALIZER), "snapshots");

	}

}
