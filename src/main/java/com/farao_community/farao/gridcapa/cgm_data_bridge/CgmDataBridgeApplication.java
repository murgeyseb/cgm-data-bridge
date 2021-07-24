/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/. */
package com.farao_community.farao.gridcapa.cgm_data_bridge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Sebastien Murgey {@literal <sebastien.murgey at rte-france.com>}
 */
@SpringBootApplication
public class CgmDataBridgeApplication {
    public static void main(String[] args) {
        SpringApplication.run(CgmDataBridgeApplication.class, args);
    }
}
