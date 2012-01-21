/*
 *      Copyright (C) 2005-2015 Team XBMC
 *      http://xbmc.org
 *
 *  This Program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2, or (at your option)
 *  any later version.
 *
 *  This Program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with XBMC Remote; see the file license.  If not, write to
 *  the Free Software Foundation, 675 Mass Ave, Cambridge, MA 02139, USA.
 *  http://www.gnu.org/copyleft/gpl.html
 *
 */

package org.xbmc.android.jsonrpc.notification;

import org.xbmc.android.jsonrpc.api.AbstractModel;
import org.xbmc.android.jsonrpc.notification.PlayerEvent.Pause;
import org.xbmc.android.jsonrpc.notification.PlayerEvent.Play;
import org.xbmc.android.jsonrpc.notification.PlayerEvent.Seek;
import org.xbmc.android.jsonrpc.notification.PlayerEvent.SpeedChanged;
import org.xbmc.android.jsonrpc.notification.PlayerEvent.Stop;

/**
 *  This is used as callback where not every type of notification needs to be
 *  implemented.
 *  
 * @author freezy <freezy@xbmc.org>
 */
public abstract class PlayerObserver {
	
	public FollowupCall<? extends AbstractModel> onPlay(Play notification) {
		return null;
	}
	public FollowupCall<? extends AbstractModel> onPause(Pause notification) {
		return null;
	}
	public FollowupCall<? extends AbstractModel> onStop(Stop notification) {
		return null;
	}
	public FollowupCall<? extends AbstractModel> onSpeedChanged(SpeedChanged notification) {
		return null;
	}
	public FollowupCall<? extends AbstractModel> onSeek(Seek notification) {
		return null;
	}
}
