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
package com.ajkaandrej.smonitor.agent.rs.client;

import com.ajkaandrej.smonitor.agent.rs.exception.ServiceException;
import com.ajkaandrej.smonitor.agent.rs.model.HostDetails;
import com.ajkaandrej.smonitor.agent.rs.model.Server;
import com.ajkaandrej.smonitor.agent.rs.service.ServerService;

/**
 *
 * @author Andrej Petras <andrej@ajka-andrej.com>
 */
public class ServerClientService extends AbstractClientService<ServerService> {

    public ServerClientService(String remote) {
        super(ServerService.class, remote);
    }
    
    public Server getServer() throws ServiceException {
        return getService().getServer(null);
    }

    public HostDetails getHost(String host) throws ServiceException {
        return getService().getHost(host, null);
    }
    
}
