// $Id$
// Copyright (c) 2004-2005 The Regents of the University of California. All
// Rights Reserved. Permission to use, copy, modify, and distribute this
// software and its documentation without fee, and without a written
// agreement is hereby granted, provided that the above copyright notice
// and this paragraph appear in all copies.  This software program and
// documentation are copyrighted by The Regents of the University of
// California. The software program and documentation are supplied "AS
// IS", without any accompanying services from The Regents. The Regents
// does not warrant that the operation of the program will be
// uninterrupted or error-free. The end-user understands that the program
// was developed for research purposes and is advised not to rely
// exclusively on the program for any reason.  IN NO EVENT SHALL THE
// UNIVERSITY OF CALIFORNIA BE LIABLE TO ANY PARTY FOR DIRECT, INDIRECT,
// SPECIAL, INCIDENTAL, OR CONSEQUENTIAL DAMAGES, INCLUDING LOST PROFITS,
// ARISING OUT OF THE USE OF THIS SOFTWARE AND ITS DOCUMENTATION, EVEN IF
// THE UNIVERSITY OF CALIFORNIA HAS BEEN ADVISED OF THE POSSIBILITY OF
// SUCH DAMAGE. THE UNIVERSITY OF CALIFORNIA SPECIFICALLY DISCLAIMS ANY
// WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
// MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE. THE SOFTWARE
// PROVIDED HEREUNDER IS ON AN "AS IS" BASIS, AND THE UNIVERSITY OF
// CALIFORNIA HAS NO OBLIGATIONS TO PROVIDE MAINTENANCE, SUPPORT,
// UPDATES, ENHANCEMENTS, OR MODIFICATIONS.

package org.argouml.model;

import java.beans.PropertyChangeListener;

/**
 * Abstract class that implements the convenience methods of the
 * {@link ModelEventPump} interface.
 *
 * The default visibility is to guarantee that it is not seen outside the
 * model component.
 *
 * @author Linus Tolke
 */
public abstract class AbstractModelEventPump {

    /**
     * @see org.argouml.model.ModelEventPump#addModelEventListener(
     *          java.beans.PropertyChangeListener, java.lang.Object,
     *          java.lang.String[])
     *
     * @param listener The listener to add.
     * @param modelelement The model element to listen to.
     * @param eventNames The names of the events to listen to.
     */
    public abstract void addModelEventListener(PropertyChangeListener listener,
            				       Object modelelement,
            				       String[] eventNames);

    /**
     * @see org.argouml.model.ModelEventPump#addModelEventListener(
     *          java.beans.PropertyChangeListener, java.lang.Object,
     *          java.lang.String)
     *
     * @param listener The listener to add.
     * @param modelelement The model element to listen to.
     * @param eventName The name of the event to listen to.
     */
    public void addModelEventListener(PropertyChangeListener listener,
            Object modelelement, String eventName) {
        addModelEventListener(listener,
                	      modelelement,
                	      new String[] {eventName });
    }

    /**
     * @see org.argouml.model.ModelEventPump#addModelEventListener(
     *          java.beans.PropertyChangeListener, java.lang.Object)
     *
     * @param listener The listener to add.
     * @param modelelement The model element to listen to.
     */
    public abstract void addModelEventListener(PropertyChangeListener listener,
            				       Object modelelement);

    /**
     * @see org.argouml.model.ModelEventPump#removeModelEventListener(
     *          java.beans.PropertyChangeListener, java.lang.Object,
     *          java.lang.String[])
     *
     * @param listener The listener to remove.
     * @param modelelement The model element to stop listening to.
     * @param eventNames The names of the events to stop listening to.
     */
    public abstract void removeModelEventListener(
            PropertyChangeListener listener,
            Object modelelement, String[] eventNames);

    /**
     * @see org.argouml.model.ModelEventPump#removeModelEventListener(
     *          java.beans.PropertyChangeListener, java.lang.Object,
     *          java.lang.String)
     *
     * @param listener The listener to remove.
     * @param modelelement The model element to stop listening to.
     * @param eventName The name of the event to stop listening to.
     */
    public void removeModelEventListener(PropertyChangeListener listener,
            				 Object modelelement,
            				 String eventName) {
        removeModelEventListener(listener,
                		 modelelement,
                		 new String[] {eventName, });
    }

    /**
     * @see org.argouml.model.ModelEventPump#removeModelEventListener(
     * 		java.beans.PropertyChangeListener, java.lang.Object)
     *
     * @param listener The listener to remove.
     * @param modelelement The model element to stop listening to.
     */
    public abstract void removeModelEventListener(
            PropertyChangeListener listener,
            Object modelelement);

    /**
     * @see org.argouml.model.ModelEventPump#addClassModelEventListener(
     * 		java.beans.PropertyChangeListener, java.lang.Object,
     * 		java.lang.String[])
     *
     * @param listener The listener to add.
     * @param modelClass The model class to listen to.
     * @param eventNames The names of the events to listen to.
     */
    public abstract void addClassModelEventListener(
            PropertyChangeListener listener,
            Object modelClass,
            String[] eventNames);

    /**
     * @see org.argouml.model.ModelEventPump#addClassModelEventListener(
     * 		java.beans.PropertyChangeListener, java.lang.Object,
     * 		java.lang.String)
     *
     * @param listener The listener to add.
     * @param modelClass The model class to listen to.
     * @param eventName The name of the event to listen to.
     */
    public void addClassModelEventListener(PropertyChangeListener listener,
            				   Object modelClass,
            				   String eventName) {
        addClassModelEventListener(listener,
                		   modelClass,
                		   new String[] {eventName, });
    }

    /**
     * @see org.argouml.model.ModelEventPump#removeClassModelEventListener(
     * 		java.beans.PropertyChangeListener, java.lang.Object,
     * 		java.lang.String[])
     *
     * @param listener The listener to remove.
     * @param modelClass The model class to stop listening to.
     * @param eventNames The names of the events to stop listening to.
     */
    public abstract void removeClassModelEventListener(
            PropertyChangeListener listener,
            Object modelClass,
            String[] eventNames);

    /**
     * @see org.argouml.model.ModelEventPump#removeClassModelEventListener(
     * 		java.beans.PropertyChangeListener, java.lang.Object,
     * 		java.lang.String)
     *
     * @param listener The listener to remove.
     * @param modelClass The model class to stop listening to.
     * @param eventName The name of the event to stop listening to.
     */
    public void removeClassModelEventListener(PropertyChangeListener listener,
            				      Object modelClass,
            				      String eventName) {
        removeClassModelEventListener(listener,
                		      modelClass,
                		      new String[] {eventName, });

    }
}
