/*******************************************************************************
 *     DarkForge a Forge Hacked Client
 *     Copyright (C) 2017  Hexeption (Keir Davis)
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/

package uk.co.hexeption.darkforge.gui.gui.theme.themes.huzuni;

import uk.co.hexeption.darkforge.DarkForge;
import uk.co.hexeption.darkforge.gui.gui.base.ComponentType;
import uk.co.hexeption.darkforge.gui.gui.theme.Theme;
import uk.co.hexeption.darkforge.gui.gui.theme.themes.darkforge.DarkForgeCheckButton;
import uk.co.hexeption.darkforge.gui.gui.theme.themes.darkforge.DarkForgeDropDown;
import uk.co.hexeption.darkforge.gui.gui.theme.themes.darkforge.DarkForgeKeybinds;
import uk.co.hexeption.darkforge.gui.gui.theme.themes.darkforge.DarkForgeText;
import uk.co.hexeption.darkforge.utils.render.Texture;

/**
 * Created by Hexeption on 19/03/2017.
 */
public class HuzuniTheme extends Theme {

    public HuzuniTheme() {

        super("Huzuni");
        this.fontRenderer = DarkForge.INSTANCE.fontManager.huzuni;
        this.icons = new Texture("textures/icons.png");
        addRenderer(ComponentType.FRAME, new HuzuniFrame(this));
        addRenderer(ComponentType.BUTTON, new HuzuniButton(this));
        addRenderer(ComponentType.SLIDER, new HuzuniSlider(this));
        addRenderer(ComponentType.CHECK_BUTTON, new DarkForgeCheckButton(this));
        addRenderer(ComponentType.EXPANDING_BUTTON, new HuzuniExpandingButton(this));
        addRenderer(ComponentType.TEXT, new DarkForgeText(this));
        addRenderer(ComponentType.KEYBIND, new DarkForgeKeybinds(this));
        addRenderer(ComponentType.DROPDOWN, new DarkForgeDropDown(this));
    }
}
