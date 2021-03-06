/*
 * Copyright 2013 Andrej_Petras.
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
package org.lorislab.smonitor.agent.rs.service;

import org.lorislab.smonitor.agent.rs.exception.AgentException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.lorislab.smonitor.connector.model.HostDetails;
import org.lorislab.smonitor.connector.model.Server;

/**
 * The server rest-service.
 *
 * @author Andrej Petras <andrej@ajka-andrej.com>
 */
@Path("server")
public interface ServerService {

    /**
     * Gets the server.
     *
     * @return the server.
     * @throws AgentException if the method fails.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    Server getServer() throws AgentException;

    /**
     * Gets the host details.
     *
     * @param host the host.
     * @return the host details.
     * @throws AgentException if the method fails.
     */
    @GET
    @Path("{host}")
    @Produces(MediaType.APPLICATION_JSON)
    HostDetails getHost(@PathParam("host") String host) throws AgentException;
}
