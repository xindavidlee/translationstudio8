package net.heartsome.cat.ts.ui.docx.common;/** * 当导入的文档非　hs 导出的校对文件时，抛出此异常 * @author robert	2013-06-25 */public class FlagErrorException extends Exception{	/**  serialVersionUID. */	private static final long serialVersionUID = 1L;		public FlagErrorException(){		super();	}		public FlagErrorException(Throwable cause, String message) {		super(message, cause);	}		public FlagErrorException(Throwable cause) {		super(cause);	}		public FlagErrorException(String message){		super(message);	}	}