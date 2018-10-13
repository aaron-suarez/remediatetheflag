/*
 *  
 * REMEDIATE THE FLAG
 * Copyright 2018 - Andrea Scaduto 
 * remediatetheflag@gmail.com
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package com.remediatetheflag.global.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.remediatetheflag.global.controllers.MonitorController;

public class MonitorServlet extends HttpServlet  {

	private static final long serialVersionUID = -4609516004404078365L;
	private static Logger logger = LoggerFactory.getLogger(MonitorServlet.class);

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		MonitorController controller = new MonitorController();
		try {
			controller.executeAction(request, response);
		} catch (Exception e1) {
			logger.error("StatsServlet Error: "+e1.getMessage());
		}
	}
}