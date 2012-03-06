/*                        TraceLine6.java

  Copyright 2003, Bil Lewis

  This program is free software; you can redistribute it and/or modify
  it under the terms of the GNU General Public License as published by
  the Free Software Foundation; either version 2 of the License, or
  (at your option) any later version.
  
  This program is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU General Public License for more details.
  
  You should have received a copy of the GNU General Public License
  along with this program; if not, write to the Free Software
  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA   
*/

package com.lambda.Debugger;

//              TraceLine/TraceLine.java

/*
 */


import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class TraceLine6 extends TraceLine  {
    private Object arg0;
    private Object arg1;
    private Object arg2;
    private Object arg3;
    private Object arg4;
    private Object arg5;

  public Object getArgActual(int i) {
    if (i == 0) return arg0;
    if (i == 1) return arg1;
    if (i == 2) return arg2;
    if (i == 3) return arg3;
    if (i == 4) return arg4;
    if (i == 5) return arg5;
    throw new DebuggerException("getArg(i>MAX) " + i);
  }

  public void putArg(int i, Object value) {
      if (i == 0) {arg0=value; return;}
      if (i == 1) {arg1=value; return;}
      if (i == 2) {arg2=value; return;}
      if (i == 3) {arg3=value; return;}
      if (i == 4) {arg4=value; return;}
      if (i == 5) {arg5=value; return;}
      throw new DebuggerException("putArg(i>MAX) " + i);
  }

  public int getArgCount() {
    return(6);
  }

    public TraceLine6(int time, String meth, Object t, int threadIndex, TraceLine tl,
		       Object a0, Object a1, Object a2, Object a3, Object a4, Object a5) {
	super(time, meth, t, threadIndex, tl);
	arg0 = a0;
	arg1 = a1;
	arg2 = a2;
	arg3 = a3;
	arg4 = a4;
	arg5 = a5;
    }


}
