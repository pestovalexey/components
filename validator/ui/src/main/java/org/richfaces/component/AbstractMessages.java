/*
 * $Id$
 * JBoss, Home of Professional Open Source
 * Copyright 2010, Red Hat, Inc. and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.richfaces.component;

import javax.faces.component.UIMessages;
import javax.faces.context.FacesContext;

import org.ajax4jsf.component.AjaxOutput;
import org.richfaces.cdk.annotations.Attribute;
import org.richfaces.cdk.annotations.JsfComponent;
import org.richfaces.cdk.annotations.JsfRenderer;
import org.richfaces.cdk.annotations.RendererSpecificComponent;
import org.richfaces.cdk.annotations.Tag;

/**
 * <p class="changed_added_4_0">
 * </p>
 *
 * @author asmirnov@exadel.com
 *
 */
@JsfComponent(generate = "org.richfaces.component.UIRichMessages", type = "org.richfaces.Messages", components = @RendererSpecificComponent(tag = @Tag(name = "messages"), generate = "org.richfaces.component.html.HtmlMessages", attributes = {
        "core-props.xml", "events-props.xml", "i18n-props.xml" }, renderer = @JsfRenderer(template = "messages.template.xml")))
public abstract class AbstractMessages extends UIMessages implements AjaxOutput, ClientSideMessage {
    @Attribute(defaultValue = "true")
    public abstract boolean isAjaxRendered();

    @Attribute
    public abstract boolean isKeepTransient();

    @Attribute(defaultValue = "true")
    public abstract boolean isEscape();

    /*
     * (non-Javadoc)
     *
     * @see org.richfaces.component.ClientSideMessage#updateMessages(javax.faces.context.FacesContext, java.lang.String)
     */
    public void updateMessages(FacesContext context, String clientId) {
        // TODO Auto-generated method stub

    }
}
