/**
 * This class file was automatically generated by jASN1 v1.8.3-SNAPSHOT (http://www.openmuc.org)
 */

package org.openmuc.jasn1.compiler.pedefinitions;

import java.io.IOException;
import java.io.EOFException;
import java.io.InputStream;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.io.Serializable;
import org.openmuc.jasn1.ber.*;
import org.openmuc.jasn1.ber.types.*;
import org.openmuc.jasn1.ber.types.string.*;


public class ApplicationSystemParameters implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);

	public byte[] code = null;
	public BerOctetString volatileMemoryQuotaC7 = null;
	public BerOctetString nonVolatileMemoryQuotaC8 = null;
	public BerOctetString globalServiceParameters = null;
	public BerOctetString implicitSelectionParameter = null;
	public BerOctetString volatileReservedMemory = null;
	public BerOctetString nonVolatileReservedMemory = null;
	public BerOctetString ts102226SIMFileAccessToolkitParameter = null;
	public TS102226AdditionalContactlessParameters ts102226AdditionalContactlessParameters = null;
	public BerOctetString contactlessProtocolParameters = null;
	public BerOctetString userInteractionContactlessParameters = null;
	
	public ApplicationSystemParameters() {
	}

	public ApplicationSystemParameters(byte[] code) {
		this.code = code;
	}

	public ApplicationSystemParameters(BerOctetString volatileMemoryQuotaC7, BerOctetString nonVolatileMemoryQuotaC8, BerOctetString globalServiceParameters, BerOctetString implicitSelectionParameter, BerOctetString volatileReservedMemory, BerOctetString nonVolatileReservedMemory, BerOctetString ts102226SIMFileAccessToolkitParameter, TS102226AdditionalContactlessParameters ts102226AdditionalContactlessParameters, BerOctetString contactlessProtocolParameters, BerOctetString userInteractionContactlessParameters) {
		this.volatileMemoryQuotaC7 = volatileMemoryQuotaC7;
		this.nonVolatileMemoryQuotaC8 = nonVolatileMemoryQuotaC8;
		this.globalServiceParameters = globalServiceParameters;
		this.implicitSelectionParameter = implicitSelectionParameter;
		this.volatileReservedMemory = volatileReservedMemory;
		this.nonVolatileReservedMemory = nonVolatileReservedMemory;
		this.ts102226SIMFileAccessToolkitParameter = ts102226SIMFileAccessToolkitParameter;
		this.ts102226AdditionalContactlessParameters = ts102226AdditionalContactlessParameters;
		this.contactlessProtocolParameters = contactlessProtocolParameters;
		this.userInteractionContactlessParameters = userInteractionContactlessParameters;
	}

	public int encode(BerByteArrayOutputStream os) throws IOException {
		return encode(os, true);
	}

	public int encode(BerByteArrayOutputStream os, boolean withTag) throws IOException {

		if (code != null) {
			for (int i = code.length - 1; i >= 0; i--) {
				os.write(code[i]);
			}
			if (withTag) {
				return tag.encode(os) + code.length;
			}
			return code.length;
		}

		int codeLength = 0;
		if (userInteractionContactlessParameters != null) {
			codeLength += userInteractionContactlessParameters.encode(os, false);
			// write tag: PRIVATE_CLASS, PRIMITIVE, 26
			os.write(0xDA);
			codeLength += 1;
		}
		
		if (contactlessProtocolParameters != null) {
			codeLength += contactlessProtocolParameters.encode(os, false);
			// write tag: PRIVATE_CLASS, PRIMITIVE, 25
			os.write(0xD9);
			codeLength += 1;
		}
		
		if (ts102226AdditionalContactlessParameters != null) {
			codeLength += ts102226AdditionalContactlessParameters.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 0
			os.write(0xA0);
			codeLength += 1;
		}
		
		if (ts102226SIMFileAccessToolkitParameter != null) {
			codeLength += ts102226SIMFileAccessToolkitParameter.encode(os, false);
			// write tag: PRIVATE_CLASS, PRIMITIVE, 10
			os.write(0xCA);
			codeLength += 1;
		}
		
		if (nonVolatileReservedMemory != null) {
			codeLength += nonVolatileReservedMemory.encode(os, false);
			// write tag: PRIVATE_CLASS, PRIMITIVE, 24
			os.write(0xD8);
			codeLength += 1;
		}
		
		if (volatileReservedMemory != null) {
			codeLength += volatileReservedMemory.encode(os, false);
			// write tag: PRIVATE_CLASS, PRIMITIVE, 23
			os.write(0xD7);
			codeLength += 1;
		}
		
		if (implicitSelectionParameter != null) {
			codeLength += implicitSelectionParameter.encode(os, false);
			// write tag: PRIVATE_CLASS, PRIMITIVE, 15
			os.write(0xCF);
			codeLength += 1;
		}
		
		if (globalServiceParameters != null) {
			codeLength += globalServiceParameters.encode(os, false);
			// write tag: PRIVATE_CLASS, PRIMITIVE, 11
			os.write(0xCB);
			codeLength += 1;
		}
		
		if (nonVolatileMemoryQuotaC8 != null) {
			codeLength += nonVolatileMemoryQuotaC8.encode(os, false);
			// write tag: PRIVATE_CLASS, PRIMITIVE, 8
			os.write(0xC8);
			codeLength += 1;
		}
		
		if (volatileMemoryQuotaC7 != null) {
			codeLength += volatileMemoryQuotaC7.encode(os, false);
			// write tag: PRIVATE_CLASS, PRIMITIVE, 7
			os.write(0xC7);
			codeLength += 1;
		}
		
		codeLength += BerLength.encodeLength(os, codeLength);

		if (withTag) {
			codeLength += tag.encode(os);
		}

		return codeLength;

	}

	public int decode(InputStream is) throws IOException {
		return decode(is, true);
	}

	public int decode(InputStream is, boolean withTag) throws IOException {
		int codeLength = 0;
		int subCodeLength = 0;
		BerTag berTag = new BerTag();

		if (withTag) {
			codeLength += tag.decodeAndCheck(is);
		}

		BerLength length = new BerLength();
		codeLength += length.decode(is);

		int totalLength = length.val;
		if (totalLength == -1) {
			subCodeLength += berTag.decode(is);

			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.PRIVATE_CLASS, BerTag.PRIMITIVE, 7)) {
				volatileMemoryQuotaC7 = new BerOctetString();
				subCodeLength += volatileMemoryQuotaC7.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.PRIVATE_CLASS, BerTag.PRIMITIVE, 8)) {
				nonVolatileMemoryQuotaC8 = new BerOctetString();
				subCodeLength += nonVolatileMemoryQuotaC8.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.PRIVATE_CLASS, BerTag.PRIMITIVE, 11)) {
				globalServiceParameters = new BerOctetString();
				subCodeLength += globalServiceParameters.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.PRIVATE_CLASS, BerTag.PRIMITIVE, 15)) {
				implicitSelectionParameter = new BerOctetString();
				subCodeLength += implicitSelectionParameter.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.PRIVATE_CLASS, BerTag.PRIMITIVE, 23)) {
				volatileReservedMemory = new BerOctetString();
				subCodeLength += volatileReservedMemory.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.PRIVATE_CLASS, BerTag.PRIMITIVE, 24)) {
				nonVolatileReservedMemory = new BerOctetString();
				subCodeLength += nonVolatileReservedMemory.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.PRIVATE_CLASS, BerTag.PRIMITIVE, 10)) {
				ts102226SIMFileAccessToolkitParameter = new BerOctetString();
				subCodeLength += ts102226SIMFileAccessToolkitParameter.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 0)) {
				ts102226AdditionalContactlessParameters = new TS102226AdditionalContactlessParameters();
				subCodeLength += ts102226AdditionalContactlessParameters.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.PRIVATE_CLASS, BerTag.PRIMITIVE, 25)) {
				contactlessProtocolParameters = new BerOctetString();
				subCodeLength += contactlessProtocolParameters.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.PRIVATE_CLASS, BerTag.PRIMITIVE, 26)) {
				userInteractionContactlessParameters = new BerOctetString();
				subCodeLength += userInteractionContactlessParameters.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			int nextByte = is.read();
			if (berTag.tagNumber != 0 || berTag.tagClass != 0 || berTag.primitive != 0
			|| nextByte != 0) {
				if (nextByte == -1) {
					throw new EOFException("Unexpected end of input stream.");
				}
				throw new IOException("Decoded sequence has wrong end of contents octets");
			}
			codeLength += subCodeLength + 1;
			return codeLength;
		}

		codeLength += totalLength;

		if (totalLength == 0) {
			return codeLength;
		}
		subCodeLength += berTag.decode(is);
		if (berTag.equals(BerTag.PRIVATE_CLASS, BerTag.PRIMITIVE, 7)) {
			volatileMemoryQuotaC7 = new BerOctetString();
			subCodeLength += volatileMemoryQuotaC7.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.PRIVATE_CLASS, BerTag.PRIMITIVE, 8)) {
			nonVolatileMemoryQuotaC8 = new BerOctetString();
			subCodeLength += nonVolatileMemoryQuotaC8.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.PRIVATE_CLASS, BerTag.PRIMITIVE, 11)) {
			globalServiceParameters = new BerOctetString();
			subCodeLength += globalServiceParameters.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.PRIVATE_CLASS, BerTag.PRIMITIVE, 15)) {
			implicitSelectionParameter = new BerOctetString();
			subCodeLength += implicitSelectionParameter.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.PRIVATE_CLASS, BerTag.PRIMITIVE, 23)) {
			volatileReservedMemory = new BerOctetString();
			subCodeLength += volatileReservedMemory.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.PRIVATE_CLASS, BerTag.PRIMITIVE, 24)) {
			nonVolatileReservedMemory = new BerOctetString();
			subCodeLength += nonVolatileReservedMemory.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.PRIVATE_CLASS, BerTag.PRIMITIVE, 10)) {
			ts102226SIMFileAccessToolkitParameter = new BerOctetString();
			subCodeLength += ts102226SIMFileAccessToolkitParameter.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 0)) {
			ts102226AdditionalContactlessParameters = new TS102226AdditionalContactlessParameters();
			subCodeLength += ts102226AdditionalContactlessParameters.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.PRIVATE_CLASS, BerTag.PRIMITIVE, 25)) {
			contactlessProtocolParameters = new BerOctetString();
			subCodeLength += contactlessProtocolParameters.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.PRIVATE_CLASS, BerTag.PRIMITIVE, 26)) {
			userInteractionContactlessParameters = new BerOctetString();
			subCodeLength += userInteractionContactlessParameters.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
		}
		throw new IOException("Unexpected end of sequence, length tag: " + totalLength + ", actual sequence length: " + subCodeLength);

		
	}

	public void encodeAndSave(int encodingSizeGuess) throws IOException {
		BerByteArrayOutputStream os = new BerByteArrayOutputStream(encodingSizeGuess);
		encode(os, false);
		code = os.getArray();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		appendAsString(sb, 0);
		return sb.toString();
	}

	public void appendAsString(StringBuilder sb, int indentLevel) {

		sb.append("{");
		boolean firstSelectedElement = true;
		if (volatileMemoryQuotaC7 != null) {
			sb.append("\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("volatileMemoryQuotaC7: ").append(volatileMemoryQuotaC7);
			firstSelectedElement = false;
		}
		
		if (nonVolatileMemoryQuotaC8 != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("nonVolatileMemoryQuotaC8: ").append(nonVolatileMemoryQuotaC8);
			firstSelectedElement = false;
		}
		
		if (globalServiceParameters != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("globalServiceParameters: ").append(globalServiceParameters);
			firstSelectedElement = false;
		}
		
		if (implicitSelectionParameter != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("implicitSelectionParameter: ").append(implicitSelectionParameter);
			firstSelectedElement = false;
		}
		
		if (volatileReservedMemory != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("volatileReservedMemory: ").append(volatileReservedMemory);
			firstSelectedElement = false;
		}
		
		if (nonVolatileReservedMemory != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("nonVolatileReservedMemory: ").append(nonVolatileReservedMemory);
			firstSelectedElement = false;
		}
		
		if (ts102226SIMFileAccessToolkitParameter != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("ts102226SIMFileAccessToolkitParameter: ").append(ts102226SIMFileAccessToolkitParameter);
			firstSelectedElement = false;
		}
		
		if (ts102226AdditionalContactlessParameters != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("ts102226AdditionalContactlessParameters: ");
			ts102226AdditionalContactlessParameters.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (contactlessProtocolParameters != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("contactlessProtocolParameters: ").append(contactlessProtocolParameters);
			firstSelectedElement = false;
		}
		
		if (userInteractionContactlessParameters != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("userInteractionContactlessParameters: ").append(userInteractionContactlessParameters);
			firstSelectedElement = false;
		}
		
		sb.append("\n");
		for (int i = 0; i < indentLevel; i++) {
			sb.append("\t");
		}
		sb.append("}");
	}

}

