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

package org.opensearch.client.opensearch.indices.stats;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.client.json.DelegatingDeserializer;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ToJsonp;
import org.opensearch.client.util.ObjectBuilder;

import java.util.Objects;

// typedef: indices.stats.ShardSequenceNumber
public final class ShardSequenceNumber implements ToJsonp {
	private final Number globalCheckpoint;

	private final Number localCheckpoint;

	private final Number maxSeqNo;

	// ---------------------------------------------------------------------------------------------

	protected ShardSequenceNumber(Builder builder) {

		this.globalCheckpoint = Objects.requireNonNull(builder.globalCheckpoint, "global_checkpoint");
		this.localCheckpoint = Objects.requireNonNull(builder.localCheckpoint, "local_checkpoint");
		this.maxSeqNo = Objects.requireNonNull(builder.maxSeqNo, "max_seq_no");

	}

	/**
	 * API name: {@code global_checkpoint}
	 */
	public Number globalCheckpoint() {
		return this.globalCheckpoint;
	}

	/**
	 * API name: {@code local_checkpoint}
	 */
	public Number localCheckpoint() {
		return this.localCheckpoint;
	}

	/**
	 * API name: {@code max_seq_no}
	 */
	public Number maxSeqNo() {
		return this.maxSeqNo;
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

		generator.writeKey("global_checkpoint");
		generator.write(this.globalCheckpoint.doubleValue());

		generator.writeKey("local_checkpoint");
		generator.write(this.localCheckpoint.doubleValue());

		generator.writeKey("max_seq_no");
		generator.write(this.maxSeqNo.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardSequenceNumber}.
	 */
	public static class Builder implements ObjectBuilder<ShardSequenceNumber> {
		private Number globalCheckpoint;

		private Number localCheckpoint;

		private Number maxSeqNo;

		/**
		 * API name: {@code global_checkpoint}
		 */
		public Builder globalCheckpoint(Number value) {
			this.globalCheckpoint = value;
			return this;
		}

		/**
		 * API name: {@code local_checkpoint}
		 */
		public Builder localCheckpoint(Number value) {
			this.localCheckpoint = value;
			return this;
		}

		/**
		 * API name: {@code max_seq_no}
		 */
		public Builder maxSeqNo(Number value) {
			this.maxSeqNo = value;
			return this;
		}

		/**
		 * Builds a {@link ShardSequenceNumber}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardSequenceNumber build() {

			return new ShardSequenceNumber(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ShardSequenceNumber
	 */
	public static final JsonpDeserializer<ShardSequenceNumber> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ShardSequenceNumber::setupShardSequenceNumberDeserializer);

	protected static void setupShardSequenceNumberDeserializer(DelegatingDeserializer<ShardSequenceNumber.Builder> op) {

		op.add(Builder::globalCheckpoint, JsonpDeserializer.numberDeserializer(), "global_checkpoint");
		op.add(Builder::localCheckpoint, JsonpDeserializer.numberDeserializer(), "local_checkpoint");
		op.add(Builder::maxSeqNo, JsonpDeserializer.numberDeserializer(), "max_seq_no");

	}

}
