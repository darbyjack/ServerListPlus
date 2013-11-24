/*
 * ServerListPlus - Customize your server's ping information!
 * Copyright (C) 2013, Minecrell
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.minecrell.serverlistplus.api.metrics;

import net.minecrell.serverlistplus.api.metrics.Metrics.Plotter;

public class SimpleCounterPlotter extends Plotter {
    public SimpleCounterPlotter() {}

    public SimpleCounterPlotter(String name) {
        super(name);
    }

    public int value = 0;

    public void count() {
        this.count(1);
    }

    public void count(int count) {
        this.value += count;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void reset() {
        this.value = 0;
    }
}