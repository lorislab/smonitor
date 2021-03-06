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
package org.lorislab.smonitor.agent.security;

/**
 *
 * @author Andrej Petras <andrej@ajka-andrej.com>
 */
public final class AgentSecurityService {
 
    public static final String HEADER_KEY = "SMonitor-Agent-Key";
    
    public static boolean checkKey(String key) {
        String privateKey = System.getProperty(AgentSecurityService.class.getName(), null);
        if (privateKey == null) {
            return key == null;
        }
        return privateKey.equals(key);       
    }
}
