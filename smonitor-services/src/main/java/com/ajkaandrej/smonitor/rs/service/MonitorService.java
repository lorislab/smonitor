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
package com.ajkaandrej.smonitor.rs.service;

import com.ajkaandrej.smonitor.agent.rs.exception.ServiceException;
import com.ajkaandrej.smonitor.rs.model.Connection;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Andrej Petras <andrej@ajka-andrej.com>
 */
@Path("monitor")
public interface MonitorService {
 
    @GET
    @Path("version")
    public String getVersion() throws ServiceException;
    
    @GET
    @Path("reloadConfig")
    public void realoadConfiguration() throws ServiceException;
    
    @GET
    @Path("connections")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Connection> getServerConnections() throws ServiceException;
}
