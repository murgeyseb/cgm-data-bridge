/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/. */
package com.farao_community.farao.gridcapa.cgm_data_bridge;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Sebastien Murgey {@literal <sebastien.murgey at rte-france.com>}
 */
@SpringBootTest
public class CgmDataBridgeApplicationTest {
    @Autowired
    CgmDataBridgeApplication cgmDataBridgeApplication;

    @Test
    void checkApplicationStarts() {
        assertNotNull(cgmDataBridgeApplication);
    }
}
