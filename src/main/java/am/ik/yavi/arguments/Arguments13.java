/*
 * Copyright (C) 2018-2020 Toshiaki Maki <makingx@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package am.ik.yavi.arguments;

/**
 * @since 0.3.0
 */
public class Arguments13<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13>
		extends Arguments12<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12> {

	protected final A13 arg13;

	Arguments13(A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8,
			A9 arg9, A10 arg10, A11 arg11, A12 arg12, A13 arg13) {
		super(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12);
		this.arg13 = arg13;
	}

	public final A13 arg13() {
		return this.arg13;
	}

	public final <X> X map(
			Arguments13.Mapper<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, X> mapper) {
		return mapper.map(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10,
				arg11, arg12, arg13);
	}

	public interface Mapper<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, X> {
		X map(A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5, A6 arg6, A7 arg7, A8 arg8,
				A9 arg9, A10 arg10, A11 arg11, A12 arg12, A13 arg13);
	}
}