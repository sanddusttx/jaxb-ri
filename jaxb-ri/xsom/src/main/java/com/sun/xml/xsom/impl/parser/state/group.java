/*
 * Copyright (c) 1997, 2021 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

/* this file is generated by RelaxNGCC */
package com.sun.xml.xsom.impl.parser.state;

import com.sun.xml.xsom.impl.*;
import com.sun.xml.xsom.impl.parser.NGCCRuntimeEx;
import com.sun.xml.xsom.parser.*;

import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;



class group extends NGCCHandler {
    private AnnotationImpl annotation;
    private String name;
    private ModelGroupImpl term;
    private ForeignAttributesImpl fa;
    protected final NGCCRuntimeEx $runtime;
    private int $_ngcc_current_state;
    protected String $uri;
    protected String $localName;
    protected String $qname;

    public final NGCCRuntime getRuntime() {
        return($runtime);
    }

    public group(NGCCHandler parent, NGCCEventSource source, NGCCRuntimeEx runtime, int cookie) {
        super(source, parent, cookie);
        $runtime = runtime;
        $_ngcc_current_state = 15;
    }

    public group(NGCCRuntimeEx runtime) {
        this(null, runtime, runtime, -1);
    }

    private void action0()throws SAXException {

    	result = new ModelGroupDeclImpl( $runtime.document,
    		annotation, loc, fa,
    		$runtime.currentSchema.getTargetNamespace(),
				name,
				term
			);

}

    private void action1()throws SAXException {

        mloc = $runtime.copyLocator();
        compositorName = $localName;

}

    private void action2()throws SAXException {
        loc = $runtime.copyLocator();
}

    public void enterElement(String $__uri, String $__local, String $__qname, Attributes $attrs) throws SAXException {
        int $ai;
        $uri = $__uri;
        $localName = $__local;
        $qname = $__qname;
        switch($_ngcc_current_state) {
        case 10:
            {
                if(($ai = $runtime.getAttributeIndex("","name"))>=0) {
                    $runtime.consumeAttribute($ai);
                    $runtime.sendEnterElement(super._cookie, $__uri, $__local, $__qname, $attrs);
                }
                else {
                    unexpectedEnterElement($__qname);
                }
            }
            break;
        case 5:
            {
                if(((($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("all")) || ($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("choice"))) || ($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("sequence")))) {
                    NGCCHandler h = new foreignAttributes(this, super._source, $runtime, 357, null);
                    spawnChildFromEnterElement(h, $__uri, $__local, $__qname, $attrs);
                }
                else {
                    unexpectedEnterElement($__qname);
                }
            }
            break;
        case 11:
            {
                if(($ai = $runtime.getAttributeIndex("","ID"))>=0) {
                    $runtime.consumeAttribute($ai);
                    $runtime.sendEnterElement(super._cookie, $__uri, $__local, $__qname, $attrs);
                }
                else {
                    $_ngcc_current_state = 10;
                    $runtime.sendEnterElement(super._cookie, $__uri, $__local, $__qname, $attrs);
                }
            }
            break;
        case 6:
            {
                if(($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("annotation"))) {
                    NGCCHandler h = new annotation(this, super._source, $runtime, 359, null,AnnotationContext.MODELGROUP_DECL);
                    spawnChildFromEnterElement(h, $__uri, $__local, $__qname, $attrs);
                }
                else {
                    $_ngcc_current_state = 5;
                    $runtime.sendEnterElement(super._cookie, $__uri, $__local, $__qname, $attrs);
                }
            }
            break;
        case 0:
            {
                revertToParentFromEnterElement(result, super._cookie, $__uri, $__local, $__qname, $attrs);
            }
            break;
        case 4:
            {
                if(((($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("all")) || ($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("choice"))) || ($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("sequence")))) {
                    $runtime.onEnterElementConsumed($__uri, $__local, $__qname, $attrs);
                    $_ngcc_current_state = 3;
                }
                else {
                    unexpectedEnterElement($__qname);
                }
            }
            break;
        case 15:
            {
                if(($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("group"))) {
                    $runtime.onEnterElementConsumed($__uri, $__local, $__qname, $attrs);
                    action2();
                    $_ngcc_current_state = 11;
                }
                else {
                    unexpectedEnterElement($__qname);
                }
            }
            break;
        case 3:
            {
                if((($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("annotation")) || (($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("group")) || (($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("element")) || (($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("any")) || ((($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("all")) || ($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("choice"))) || ($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("sequence")))))))) {
                    NGCCHandler h = new modelGroupBody(this, super._source, $runtime, 355, mloc,compositorName);
                    spawnChildFromEnterElement(h, $__uri, $__local, $__qname, $attrs);
                }
                else {
                    unexpectedEnterElement($__qname);
                }
            }
            break;
        default:
            {
                unexpectedEnterElement($__qname);
            }
            break;
        }
    }

    public void leaveElement(String $__uri, String $__local, String $__qname) throws SAXException {
        int $ai;
        $uri = $__uri;
        $localName = $__local;
        $qname = $__qname;
        switch($_ngcc_current_state) {
        case 10:
            {
                if(($ai = $runtime.getAttributeIndex("","name"))>=0) {
                    $runtime.consumeAttribute($ai);
                    $runtime.sendLeaveElement(super._cookie, $__uri, $__local, $__qname);
                }
                else {
                    unexpectedLeaveElement($__qname);
                }
            }
            break;
        case 11:
            {
                if(($ai = $runtime.getAttributeIndex("","ID"))>=0) {
                    $runtime.consumeAttribute($ai);
                    $runtime.sendLeaveElement(super._cookie, $__uri, $__local, $__qname);
                }
                else {
                    $_ngcc_current_state = 10;
                    $runtime.sendLeaveElement(super._cookie, $__uri, $__local, $__qname);
                }
            }
            break;
        case 1:
            {
                if(($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("group"))) {
                    $runtime.onLeaveElementConsumed($__uri, $__local, $__qname);
                    $_ngcc_current_state = 0;
                    action0();
                }
                else {
                    unexpectedLeaveElement($__qname);
                }
            }
            break;
        case 6:
            {
                $_ngcc_current_state = 5;
                $runtime.sendLeaveElement(super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 0:
            {
                revertToParentFromLeaveElement(result, super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 2:
            {
                if(((($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("all")) || ($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("choice"))) || ($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("sequence")))) {
                    $runtime.onLeaveElementConsumed($__uri, $__local, $__qname);
                    $_ngcc_current_state = 1;
                }
                else {
                    unexpectedLeaveElement($__qname);
                }
            }
            break;
        case 3:
            {
                if(((($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("all")) || ($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("choice"))) || ($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("sequence")))) {
                    NGCCHandler h = new modelGroupBody(this, super._source, $runtime, 355, mloc,compositorName);
                    spawnChildFromLeaveElement(h, $__uri, $__local, $__qname);
                }
                else {
                    unexpectedLeaveElement($__qname);
                }
            }
            break;
        default:
            {
                unexpectedLeaveElement($__qname);
            }
            break;
        }
    }

    public void enterAttribute(String $__uri, String $__local, String $__qname) throws SAXException {
        int $ai;
        $uri = $__uri;
        $localName = $__local;
        $qname = $__qname;
        switch($_ngcc_current_state) {
        case 10:
            {
                if(($__uri.equals("") && $__local.equals("name"))) {
                    $_ngcc_current_state = 9;
                }
                else {
                    unexpectedEnterAttribute($__qname);
                }
            }
            break;
        case 11:
            {
                if(($__uri.equals("") && $__local.equals("ID"))) {
                    $_ngcc_current_state = 13;
                }
                else {
                    $_ngcc_current_state = 10;
                    $runtime.sendEnterAttribute(super._cookie, $__uri, $__local, $__qname);
                }
            }
            break;
        case 6:
            {
                $_ngcc_current_state = 5;
                $runtime.sendEnterAttribute(super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 0:
            {
                revertToParentFromEnterAttribute(result, super._cookie, $__uri, $__local, $__qname);
            }
            break;
        default:
            {
                unexpectedEnterAttribute($__qname);
            }
            break;
        }
    }

    public void leaveAttribute(String $__uri, String $__local, String $__qname) throws SAXException {
        int $ai;
        $uri = $__uri;
        $localName = $__local;
        $qname = $__qname;
        switch($_ngcc_current_state) {
        case 11:
            {
                $_ngcc_current_state = 10;
                $runtime.sendLeaveAttribute(super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 6:
            {
                $_ngcc_current_state = 5;
                $runtime.sendLeaveAttribute(super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 0:
            {
                revertToParentFromLeaveAttribute(result, super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 12:
            {
                if(($__uri.equals("") && $__local.equals("ID"))) {
                    $_ngcc_current_state = 10;
                }
                else {
                    unexpectedLeaveAttribute($__qname);
                }
            }
            break;
        case 8:
            {
                if(($__uri.equals("") && $__local.equals("name"))) {
                    $_ngcc_current_state = 6;
                }
                else {
                    unexpectedLeaveAttribute($__qname);
                }
            }
            break;
        default:
            {
                unexpectedLeaveAttribute($__qname);
            }
            break;
        }
    }

    public void text(String $value) throws SAXException {
        int $ai;
        switch($_ngcc_current_state) {
        case 10:
            {
                if(($ai = $runtime.getAttributeIndex("","name"))>=0) {
                    $runtime.consumeAttribute($ai);
                    $runtime.sendText(super._cookie, $value);
                }
            }
            break;
        case 11:
            {
                if(($ai = $runtime.getAttributeIndex("","ID"))>=0) {
                    $runtime.consumeAttribute($ai);
                    $runtime.sendText(super._cookie, $value);
                }
                else {
                    $_ngcc_current_state = 10;
                    $runtime.sendText(super._cookie, $value);
                }
            }
            break;
        case 6:
            {
                $_ngcc_current_state = 5;
                $runtime.sendText(super._cookie, $value);
            }
            break;
        case 0:
            {
                revertToParentFromText(result, super._cookie, $value);
            }
            break;
        case 9:
            {
                name = $runtime.collapse($value);
                $_ngcc_current_state = 8;
            }
            break;
        case 13:
            {
                $_ngcc_current_state = 12;
            }
            break;
        }
    }

    public void onChildCompleted(Object $__result__, int $__cookie__, boolean $__needAttCheck__)throws SAXException {
        switch($__cookie__) {
        case 357:
            {
                fa = ((ForeignAttributesImpl)$__result__);
                action1();
                $_ngcc_current_state = 4;
            }
            break;
        case 359:
            {
                annotation = ((AnnotationImpl)$__result__);
                $_ngcc_current_state = 5;
            }
            break;
        case 355:
            {
                term = ((ModelGroupImpl)$__result__);
                $_ngcc_current_state = 2;
            }
            break;
        }
    }

    public boolean accepted() {
        return(($_ngcc_current_state == 0));
    }


  		private ModelGroupDeclImpl result;
  		private Locator loc,mloc;
  		private String compositorName;

}

