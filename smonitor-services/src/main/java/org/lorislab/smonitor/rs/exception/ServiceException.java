/*
 * Copyright 2013 lorislab.org.
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
package org.lorislab.smonitor.rs.exception;

/**
 *
 * @author Andrej Petras
 */
public class ServiceException  extends RuntimeException {
    
    private static final long serialVersionUID = -4382293726363854140L;
    
    private String ref;
    
    
    public ServiceException(String ref, String msg) {        
        super(msg);
        this.ref = ref;
    }
    
    public ServiceException(String ref, Throwable ex) {
        super(ex);
        this.ref = ref;
    }

    public ServiceException(String ref, String msg, Throwable ex) {
        super(msg, ex);
        this.ref = ref;
    }    

    public String getRef() {
        return ref;
    }
        
}
