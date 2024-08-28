/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.keycloak.models;

import org.keycloak.crypto.Algorithm;

/**
 * @author <a href="mailto:bill@burkecentral.com">Bill Burke</a>
 * @version $Revision: 1 $
 */
public final class Constants {

    public static final String ADMIN_CONSOLE_CLIENT_ID = "security-admin-console";
    public static final String ADMIN_CLI_CLIENT_ID = "admin-cli";
    public static final String ACCOUNT_MANAGEMENT_CLIENT_ID = "account";
    public static final String ACCOUNT_CONSOLE_CLIENT_ID = "account-console";
    public static final String BROKER_SERVICE_CLIENT_ID = "broker";
    public static final String REALM_MANAGEMENT_CLIENT_ID = "realm-management";
    public static final String AUTH_BASE_URL_PROP = "${authBaseUrl}";
    public static final String AUTH_ADMIN_URL_PROP = "${authAdminUrl}";
    public static final String DEFAULT_SIGNATURE_ALGORITHM = Algorithm.RS256;
    public static final String INTERNAL_SIGNATURE_ALGORITHM = Algorithm.HS512;
    public static final String DEFAULT_ROLES_ROLE_PREFIX = "default-roles";
}
