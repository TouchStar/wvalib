/*
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0. If a copy of
 * the MPL was not distributed with this file, You can obtain one at http://mozilla.org/MPL/2.0/.
 *
 * Copyright (c) 2014 Digi International Inc., All Rights Reserved.
 */

package com.digi.wva.exc;

public class EndpointUnknownException extends Exception {
    private static final long serialVersionUID = 7708325150097479473L;

    public EndpointUnknownException(String detailMessage) {
        super(detailMessage);
    }

}