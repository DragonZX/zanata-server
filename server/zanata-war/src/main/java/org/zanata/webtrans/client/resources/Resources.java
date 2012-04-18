/*
 * Copyright 2010, Red Hat, Inc. and individual contributors as indicated by the
 * @author tags. See the copyright.txt file in the distribution for a full
 * listing of individual contributors.
 * 
 * This is free software; you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 * 
 * This software is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this software; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA, or see the FSF
 * site: http://www.fsf.org.
 */
package org.zanata.webtrans.client.resources;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.DataResource;
import com.google.gwt.resources.client.ImageResource;

/**
 * Resources used by the entire application.
 */
public interface Resources extends ClientBundle
{

   @Source("org/zanata/webtrans/WebTransStyles.css")
   WebTransStyles style();

   @Source("org/zanata/webtrans/images/banner_bg.png")
   DataResource bannerBackground();
   
   @Source("org/zanata/webtrans/images/z-logo-16px.png")
   ImageResource logo();

   @Source("org/zanata/webtrans/images/x.png")
   ImageResource xButton();

   @Source("org/zanata/webtrans/images/crystal_project/_16x16/filesystems/file_doc.png")
   ImageResource documentImage();

   @Source("org/zanata/webtrans/images/crystal_project/_16x16/actions/info.png")
   ImageResource informationImage();

   @Source("org/zanata/webtrans/images/next_entry.png")
   ImageResource nextEntry();

   @Source("org/zanata/webtrans/images/prev_entry.png")
   ImageResource prevEntry();

   @Source("org/zanata/webtrans/images/next_mode.png")
   ImageResource nextState();

   @Source("org/zanata/webtrans/images/prev_mode.png")
   ImageResource prevState();

   @Source("org/zanata/webtrans/images/first_entry.png")
   ImageResource firstEntry();

   @Source("org/zanata/webtrans/images/last_entry.png")
   ImageResource lastEntry();

   @Source("org/zanata/webtrans/images/first_page.png")
   ImageResource firstPageImage();

   @Source("org/zanata/webtrans/images/prev_page.png")
   ImageResource prevPageImage();

   @Source("org/zanata/webtrans/images/next_page.png")
   ImageResource nextPageImage();

   @Source("org/zanata/webtrans/images/last_page.png")
   ImageResource lastPageImage();

   @Source("org/zanata/webtrans/images/undo.png")
   ImageResource undo();

   @Source("org/zanata/webtrans/images/redo.png")
   ImageResource redo();

   @Source("org/zanata/webtrans/images/undo_disabled.png")
   ImageResource undoDisabled();

   @Source("org/zanata/webtrans/images/redo_disabled.png")
   ImageResource redoDisabled();
   
   @Source("org/zanata/webtrans/images/loader.gif")
   ImageResource loader();
}