/*
 * This file is part of HuskChat, licensed under the Apache License 2.0.
 *
 *  Copyright (c) William278 <will27528@gmail.com>
 *  Copyright (c) contributors
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package net.william278.huskchat.velocity;

import com.velocitypowered.api.proxy.Player;
import net.william278.huskchat.HuskChat;
import net.william278.huskchat.HuskChatAPI;
import net.william278.huskchat.velocity.player.VelocityPlayer;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

public class VelocityHuskChatAPI extends HuskChatAPI {
    public VelocityHuskChatAPI(HuskChat plugin) {
        super(plugin);
    }

    public static VelocityHuskChatAPI getInstance() {
        return (VelocityHuskChatAPI) instance;
    }

    /**
     * @hidden
     */
    @ApiStatus.Internal
    public static void register(@NotNull VelocityHuskChat plugin) {
        HuskChatAPI.instance = new VelocityHuskChatAPI(plugin);
    }

    /**
     * Adapts a platform-specific Player object to a cross-platform Player object
     * @param player Must be a platform-specific Player object, e.g. a Velocity Player
     * @return {@link VelocityPlayer}
     */
    public VelocityPlayer adaptPlayer(@NotNull Player player) {
        return VelocityPlayer.adapt(player);
    }
}
