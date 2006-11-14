/* LanguageTool, a natural language style checker 
 * Copyright (C) 2006 Daniel Naber (http://www.danielnaber.de)
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301
 * USA
 */
package de.danielnaber.languagetool.tagging.it;

import java.io.IOException;

import junit.framework.TestCase;
import de.danielnaber.languagetool.TestTools;
import de.danielnaber.languagetool.tokenizers.WordTokenizer;

public class ItalianTaggerTest extends TestCase {
    private ItalianTagger tagger;
      private WordTokenizer tokenizer;
      
      public void setUp() {
        tagger = new ItalianTagger();
        tokenizer = new WordTokenizer();
      }

      public void testTagger() throws IOException {
        TestTools.myAssert("Non c'è linguaggio senza inganno.", "Non/[non]ADV c/[null]null è/[essere]VER:ind+pres+3+s|è/[essere]AUX:ind+pres+3+s linguaggio/[linguaggio]NOUN-M:s senza/[senza]CON|senza/[senza]PRE inganno/[inganno]NOUN-M:s|inganno/[ingannare]VER:ind+pres+1+s", tokenizer, tagger);
        TestTools.myAssert("Amo quelli che desiderano l'impossibile.", "Amo/[amare]VER:ind+pres+1+s quelli/[quello]DET-DEMO:m+p|quelli/[quelli]PRO-DEMO-M-P che/[che]CON|che/[che]DET-WH:m+p|che/[che]DET-WH:m+s|che/[che]DET-WH:f+p|che/[che]DET-WH:f+s|che/[che]WH-CHE desiderano/[desiderare]VER:ind+pres+3+p l/[null]null impossibile/[impossibile]ADJ:pos+f+s|impossibile/[impossibile]ADJ:pos+m+s", tokenizer, tagger);
        TestTools.myAssert("blablabla","blablabla/[null]null", tokenizer, tagger);        
      }

}
