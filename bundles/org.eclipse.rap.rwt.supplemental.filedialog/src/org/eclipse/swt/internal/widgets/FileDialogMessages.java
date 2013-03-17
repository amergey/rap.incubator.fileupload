/*******************************************************************************
 * Copyright (c) 2013 EclipseSource and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    EclipseSource - initial API and implementation
 ******************************************************************************/
package org.eclipse.swt.internal.widgets;

import org.eclipse.rap.rwt.RWT;

public class FileDialogMessages {

  public static final String PERCENT = "%";
  
  public String FileDialog_FileSelectorTooltip;
  public String FileDialog_FiterComboTooltip;
  public String FileDialog_AllFilesExtension;
  public String FileDialog_OkButtonUploadingText;
  public String FileDialog_OkButtonTooltip;
  public String FileDialog_OkButtonTooltipDisable;
  public String ProgressCollector_TotalUploadProgress;
  public String UploadPanel_BrowseButtonText;
  public String UploadPanel_BrowseButtonTooltip;
  public String UploadPanel_FileTextTooltip;
  public String UploadPanel_ProgressBarTooltip;
  public String UploadPanel_RemoveButtonTooltip;
  public String UploadPanel_FileTextWarnNotMatchTooltip;

  public static FileDialogMessages get() {
    Object result = RWT.NLS.getISO8859_1Encoded( "org.eclipse.swt.internal.widgets.messages",
                                                 FileDialogMessages.class );
    return ( FileDialogMessages )result;
  }
}
