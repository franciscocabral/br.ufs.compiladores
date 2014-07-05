/* This file was generated by SableCC (http://www.sablecc.org/). */

package expression.node;

import expression.analysis.*;

@SuppressWarnings("nls")
public final class AExpressaoRelacionalExpressaoRelac extends PExpressaoRelac
{
    private PParenteses _parenteses_;
    private PSinalIgualdade _sinalIgualdade_;
    private PTermoRelac _termoRelac_;

    public AExpressaoRelacionalExpressaoRelac()
    {
        // Constructor
    }

    public AExpressaoRelacionalExpressaoRelac(
        @SuppressWarnings("hiding") PParenteses _parenteses_,
        @SuppressWarnings("hiding") PSinalIgualdade _sinalIgualdade_,
        @SuppressWarnings("hiding") PTermoRelac _termoRelac_)
    {
        // Constructor
        setParenteses(_parenteses_);

        setSinalIgualdade(_sinalIgualdade_);

        setTermoRelac(_termoRelac_);

    }

    @Override
    public Object clone()
    {
        return new AExpressaoRelacionalExpressaoRelac(
            cloneNode(this._parenteses_),
            cloneNode(this._sinalIgualdade_),
            cloneNode(this._termoRelac_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpressaoRelacionalExpressaoRelac(this);
    }

    public PParenteses getParenteses()
    {
        return this._parenteses_;
    }

    public void setParenteses(PParenteses node)
    {
        if(this._parenteses_ != null)
        {
            this._parenteses_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parenteses_ = node;
    }

    public PSinalIgualdade getSinalIgualdade()
    {
        return this._sinalIgualdade_;
    }

    public void setSinalIgualdade(PSinalIgualdade node)
    {
        if(this._sinalIgualdade_ != null)
        {
            this._sinalIgualdade_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._sinalIgualdade_ = node;
    }

    public PTermoRelac getTermoRelac()
    {
        return this._termoRelac_;
    }

    public void setTermoRelac(PTermoRelac node)
    {
        if(this._termoRelac_ != null)
        {
            this._termoRelac_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._termoRelac_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._parenteses_)
            + toString(this._sinalIgualdade_)
            + toString(this._termoRelac_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._parenteses_ == child)
        {
            this._parenteses_ = null;
            return;
        }

        if(this._sinalIgualdade_ == child)
        {
            this._sinalIgualdade_ = null;
            return;
        }

        if(this._termoRelac_ == child)
        {
            this._termoRelac_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._parenteses_ == oldChild)
        {
            setParenteses((PParenteses) newChild);
            return;
        }

        if(this._sinalIgualdade_ == oldChild)
        {
            setSinalIgualdade((PSinalIgualdade) newChild);
            return;
        }

        if(this._termoRelac_ == oldChild)
        {
            setTermoRelac((PTermoRelac) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}