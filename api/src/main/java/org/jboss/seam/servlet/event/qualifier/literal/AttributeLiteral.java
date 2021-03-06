/*
 * JBoss, Home of Professional Open Source
 * Copyright 2010, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.seam.servlet.event.qualifier.literal;

import javax.enterprise.util.AnnotationLiteral;

import org.jboss.seam.servlet.event.qualifier.Attribute;

/*
 * @author Nicklas Karlsson
 */
public class AttributeLiteral extends AnnotationLiteral<Attribute> implements Attribute
{
   private static final long serialVersionUID = 4238099273536726316L;

   public static final Attribute INSTANCE = new AttributeLiteral();

   private final String value;

   public AttributeLiteral()
   {
      this.value = "";
   }

   public AttributeLiteral(final String value)
   {
      this.value = value;
   }

   public String value()
   {
      return value;
   }
}
