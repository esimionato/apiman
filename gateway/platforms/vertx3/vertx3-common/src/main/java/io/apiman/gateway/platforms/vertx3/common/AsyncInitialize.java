/*
 * Copyright 2017 JBoss Inc
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

package io.apiman.gateway.platforms.vertx3.common;

import io.apiman.gateway.engine.async.IAsyncResultHandler;

/**
* @author Marc Savy {@literal <marc@rhymewithgravy.com>}
*/
public interface AsyncInitialize {

    /**
     * Initialise something, and indicate when it's completed via resultHandler.
     * @param resultHandler called when initialisation is complete, or with an error.
     */
    void initialize(IAsyncResultHandler<Void> resultHandler);
}