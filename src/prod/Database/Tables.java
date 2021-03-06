/* 
 * BSD 3-Clause License
 *
 * Copyright (c) 2017, Aswa Paul
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 * 
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 * 
 * * Neither the name of the copyright holder nor the names of its
 *   contributors may be used to endorse or promote products derived from
 *   this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE*  ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package prod.Database;

/**
 *
 * @author giantas
 */
public class Tables {
    
    public class Prod {
        public static final String TABLE_NAME = "prod";
        public static final String COLUMN_TITLE = "title";
        public static final String COLUMN_BODY = "body";
        public static final String COLUMN_DATE = "date";
        public static final String COLUMN_CREATE_DATE = "create_date";

        public static final String COLUMN_TITLE_TYPE = "TEXT NOT NULL";
        public static final String COLUMN_BODY_TYPE = "TEXT";
        public static final String COLUMN_DATE_TYPE = "DATE";
        public static final String COLUMN_CREATE_DATE_TYPE = "DATE NOT NULL";

        public static final String CREATE_TABLE_QUERY = "CREATE TABLE IF NOT EXISTS " +
                TABLE_NAME + "(" + 
                COLUMN_TITLE + " " + COLUMN_TITLE_TYPE + "," +
                COLUMN_BODY + " " + COLUMN_BODY_TYPE + "," + 
                COLUMN_DATE + " " + COLUMN_DATE_TYPE + "," +
                COLUMN_CREATE_DATE + " " + COLUMN_CREATE_DATE_TYPE +")";
    }
    
    
    
}
