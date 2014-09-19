/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.pinterest.secor.io;

import java.io.IOException;

/**
 * Generic file writer interface for all secor files
 * 
 * @author Praveen Murugesan (praveen@uber.com)
 *
 */
public interface FileWriter {
	
	/**
	 * Close the file
	 * @throws IOException
	 */
	public void close() throws IOException;
	
	/**
	 * Get length of data written up to now to the underlying file
	 * @return
	 * @throws IOException
	 */
	public long getLength() throws IOException;
	
	/**
	 * Write the given key and value to the file
	 * 
	 * @param key
	 * @param value
	 * @throws IOException
	 */
	public void write(long key, byte[] value) throws IOException;

}
