/*
    Copyright 2020 Udit Karode <udit.karode@gmail.com>

    This file is part of AbleMusicPlayer.

    AbleMusicPlayer is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, version 3 of the License.

    AbleMusicPlayer is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with AbleMusicPlayer.  If not, see <https://www.gnu.org/licenses/>.
*/

package io.github.uditkarode.able.utils

import android.os.Environment
import java.io.File

class Constants {
    companion object {
        @Suppress("DEPRECATION")
        val playlistFolder = File(
            Environment.getExternalStorageDirectory(),
            "AbleMusic/playlists")

        @Suppress("DEPRECATION")
        val ableSongDir = File(
            Environment.getExternalStorageDirectory(),
            "AbleMusic")

        val playlistSongDir = File(ableSongDir.absolutePath + "/playlist_songs")

        const val FLURRY_KEY = "INSERT_FLURRY_KEY"
        const val RAPID_API_KEY= "INSERT_RAPID_KEY"
        const val VERSION = "Debug"

        const val DEEZER_API = "https://deezerdevs-deezer.p.rapidapi.com/search?q="
        const val SP_NAME = "able"
        const val CHANNEL_ID = "AbleMusicDownload"
    }
}