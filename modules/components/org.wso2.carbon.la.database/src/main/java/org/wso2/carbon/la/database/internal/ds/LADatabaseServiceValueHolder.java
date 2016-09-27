/*
 * Copyright (c) 2014, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.carbon.la.database.internal.ds;


import org.wso2.carbon.la.database.DatabaseService;
import org.wso2.carbon.utils.ConfigurationContextService;

public class LADatabaseServiceValueHolder {
    private static DatabaseService databaseService;
    private static ConfigurationContextService contextService;

    public static  void registerDatabaseService(DatabaseService databaseService){
        LADatabaseServiceValueHolder.databaseService = databaseService;
    }

    public static DatabaseService getDatabaseService(){
        return databaseService;
    }

    public static void setContextService(ConfigurationContextService contextService) {
        LADatabaseServiceValueHolder.contextService = contextService;
    }

    public static ConfigurationContextService getContextService() {
        return contextService;
    }

}
