package com.mobandme.remotte.listener;

/**
 * Copyright Mob&Me 2014 (@MobAndMe)
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
 *
 * Website: http://mobandme.com
 * Contact: Txus Ballesteros <txus.ballesteros@mobandme.com>
 */

import com.mobandme.remotte.Remotte;

/**
 * Use this callback to retrieve the Barometer sensor changes.
 * @author Txus Ballesteros
 * @version 1
 * @since 1
 */
public interface AltimeterSensorCallback {

    /**
     * This event will be thrown when Remmotte notify a change on Altimeter sensor.
     * @param remotte The Remotte device that is the origin of the event.
     * @param pressure The value of atmospheric pressure in nPA.
     * @param altitude The value of altitude in meters.
     */
    void onAltimeterChange(Remotte remotte, double pressure, double altitude);
}
