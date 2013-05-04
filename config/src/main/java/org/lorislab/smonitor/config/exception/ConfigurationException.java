/*
 * Copyright 2013 Andrej Petras <andrej@ajka-andrej.com>.
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
package org.lorislab.smonitor.config.exception;

/**
 * The configuration exception.
 *
 * @author Andrej Petras <andrej@ajka-andrej.com>
 */
public class ConfigurationException extends Exception {

    /**
     * The UID for this class.
     */
    private static final long serialVersionUID = 4130633452476054466L;

    /**
     * Creates the configuration exception.
     *
     * @param message the message.
     */
    public ConfigurationException(String message) {
        super(message);
    }

    /**
     * Creates the configuration exception.
     *
     * @param message the message.
     * @param exception the exception.
     */
    public ConfigurationException(String message, Throwable exception) {
        super(message, exception);
    }
}