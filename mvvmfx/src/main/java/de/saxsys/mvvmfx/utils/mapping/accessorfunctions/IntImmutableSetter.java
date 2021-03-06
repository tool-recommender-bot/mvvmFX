package de.saxsys.mvvmfx.utils.mapping.accessorfunctions;

import java.util.function.BiFunction;

/**
 * A functional interface to define an immutable "setter" method of type {@link Integer}.
 * As the model element is immutable this method is not a real "setter".
 * Instead it returns a new immutable copy of the original model element that has the
 * specified field updated to the new value.
 *
 * @param <M>
 *            the generic type of the model.
 */
@FunctionalInterface
public interface IntImmutableSetter<M> extends BiFunction<M, Integer, M> {
	/**
	 * @param model
	 *            the model instance.
	 * @param newValue
	 *            the new value to be set.
	 */
	@Override
	M apply(M model, Integer newValue);
}
