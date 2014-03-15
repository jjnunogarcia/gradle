/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gradle.tooling.model;

import org.gradle.api.Incubating;

/**
 * Represents a launchable that uses task name to select tasks executed from a given context.
 *
 * @since 1.12
 */
@Incubating
public interface TaskSelector extends Launchable {
    /**
     * Returns the name of this selector. Note that the name is not necessarily a unique identifier for the launchable.
     *
     * @return The name of this selector.
     */
    String getName();
}
