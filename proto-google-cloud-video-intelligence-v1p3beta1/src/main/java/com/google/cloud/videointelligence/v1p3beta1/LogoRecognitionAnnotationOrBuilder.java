/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1p3beta1/video_intelligence.proto

package com.google.cloud.videointelligence.v1p3beta1;

public interface LogoRecognitionAnnotationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1p3beta1.LogoRecognitionAnnotation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Entity category information to specify the logo class that all the logo
   * tracks within this LogoRecognitionAnnotation are recognized as.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1p3beta1.Entity entity = 1;</code>
   */
  boolean hasEntity();
  /**
   *
   *
   * <pre>
   * Entity category information to specify the logo class that all the logo
   * tracks within this LogoRecognitionAnnotation are recognized as.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1p3beta1.Entity entity = 1;</code>
   */
  com.google.cloud.videointelligence.v1p3beta1.Entity getEntity();
  /**
   *
   *
   * <pre>
   * Entity category information to specify the logo class that all the logo
   * tracks within this LogoRecognitionAnnotation are recognized as.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1p3beta1.Entity entity = 1;</code>
   */
  com.google.cloud.videointelligence.v1p3beta1.EntityOrBuilder getEntityOrBuilder();

  /**
   *
   *
   * <pre>
   * All logo tracks where the recognized logo appears. Each track corresponds
   * to one logo instance appearing in consecutive frames.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 2;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1p3beta1.Track> getTracksList();
  /**
   *
   *
   * <pre>
   * All logo tracks where the recognized logo appears. Each track corresponds
   * to one logo instance appearing in consecutive frames.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 2;</code>
   */
  com.google.cloud.videointelligence.v1p3beta1.Track getTracks(int index);
  /**
   *
   *
   * <pre>
   * All logo tracks where the recognized logo appears. Each track corresponds
   * to one logo instance appearing in consecutive frames.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 2;</code>
   */
  int getTracksCount();
  /**
   *
   *
   * <pre>
   * All logo tracks where the recognized logo appears. Each track corresponds
   * to one logo instance appearing in consecutive frames.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 2;</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1p3beta1.TrackOrBuilder>
      getTracksOrBuilderList();
  /**
   *
   *
   * <pre>
   * All logo tracks where the recognized logo appears. Each track corresponds
   * to one logo instance appearing in consecutive frames.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 2;</code>
   */
  com.google.cloud.videointelligence.v1p3beta1.TrackOrBuilder getTracksOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * All video segments where the recognized logo appears. There might be
   * multiple instances of the same logo class appearing in one VideoSegment.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.VideoSegment segments = 3;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1p3beta1.VideoSegment> getSegmentsList();
  /**
   *
   *
   * <pre>
   * All video segments where the recognized logo appears. There might be
   * multiple instances of the same logo class appearing in one VideoSegment.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.VideoSegment segments = 3;</code>
   */
  com.google.cloud.videointelligence.v1p3beta1.VideoSegment getSegments(int index);
  /**
   *
   *
   * <pre>
   * All video segments where the recognized logo appears. There might be
   * multiple instances of the same logo class appearing in one VideoSegment.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.VideoSegment segments = 3;</code>
   */
  int getSegmentsCount();
  /**
   *
   *
   * <pre>
   * All video segments where the recognized logo appears. There might be
   * multiple instances of the same logo class appearing in one VideoSegment.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.VideoSegment segments = 3;</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1p3beta1.VideoSegmentOrBuilder>
      getSegmentsOrBuilderList();
  /**
   *
   *
   * <pre>
   * All video segments where the recognized logo appears. There might be
   * multiple instances of the same logo class appearing in one VideoSegment.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.VideoSegment segments = 3;</code>
   */
  com.google.cloud.videointelligence.v1p3beta1.VideoSegmentOrBuilder getSegmentsOrBuilder(
      int index);
}
